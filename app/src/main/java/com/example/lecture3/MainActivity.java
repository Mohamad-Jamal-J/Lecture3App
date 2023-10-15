package com.example.lecture3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //added comment to test git
    private Spinner productTypeSpinner;
    private Spinner productSpinner;
    private Spinner paymentSpinner;
    private Spinner deliverySpinner;
    private TextView resultTextView;
    private final AndrozonDB ANDROZON_DB = new AndrozonDB();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productTypeSpinner = findViewById(R.id.productTypeSpinner);
        productSpinner = findViewById(R.id.productSpinner);
        paymentSpinner = findViewById(R.id.paymentSpinner);
        deliverySpinner = findViewById(R.id.deliverySpinner);
        Button orderButton = findViewById(R.id.orderButton);
        resultTextView = findViewById(R.id.resultTextView);
        // Set up the button click listener
        orderButton.setOnClickListener(click -> {
            // Get the selected items from the spinners
            String selectedProductType = productTypeSpinner.getSelectedItem().toString();
            String selectedProduct = productSpinner.getSelectedItem().toString();
            String selectedPayment = paymentSpinner.getSelectedItem().toString();
            String selectedDelivery = deliverySpinner.getSelectedItem().toString();

            // Check if the first item (hint) is selected in any of the spinners
            String res = "";
            if (selectedProductType.equals(getString(R.string.product_hint)))
                res += "Please choose a product.\n";
            if (selectedDelivery.equals(getString(R.string.delivery_hint)))
                res += "Please choose a delivery method.\n";
            if (selectedPayment.equals(getString(R.string.payment_hint)))
                res += "Please choose a payment method.";
            if (res.isEmpty()){
                // If all are selected, show the result
                res = "You ordered:\n\n-" + selectedProductType +
                        "\n\n-product details: " + selectedProduct +
                        "\n\n-your payment method: " + selectedPayment +
                        "\n\n-delivery type: " + selectedDelivery + ".";
            }
            resultTextView.setText(res);
        });
        productTypeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // Get the selected product type
                String selectedProductType = parentView.getItemAtPosition(position).toString();

                // Dynamically fetch the list of options from Androzon based on the selected product type
                String[] productOptions;
                switch (selectedProductType) {
                    case "Mobile":
                        productOptions = ANDROZON_DB.getMobilesAsStringArray();
                        break;
                    case "Laptop":
                        productOptions = ANDROZON_DB.getLaptopsAsStringArray();
                        break;
                    case "Headphone":
                        productOptions = ANDROZON_DB.getHeadphonesAsStringArray();
                        break;
                    default:
                        // Default to an empty array
                        productOptions = new String[]{"Select a product type first"};
                        break;
                }

                // Create and set an adapter for the productSpinner
                ArrayAdapter<String> productAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_item, productOptions);
                productAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                productSpinner.setAdapter(productAdapter);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}