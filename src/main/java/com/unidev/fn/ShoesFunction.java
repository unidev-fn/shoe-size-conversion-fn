package com.unidev.fn;

/**
 * Function for conversion of shoes size.
 */
public class ShoesFunction {

    // US Euro UK  Inches CM
    static final String SIZE_MATRIX[][] = {
        {"4","35","2","8.1875","20.8"},
        {"4.5","35","2.5","8.375","21.3"},
        {"5","35-36","3","8.5","21.6"},
        {"5.5","36","3.5","8.75","22.2"},
        {"6","36-37","4","8.875","22.5"},
        {"6.5","37","4.5","9.0625","23"},
        {"7","37-38","5","9.25","23.5"},
        {"7.5","38","5.5","9.375","23.8"},
        {"8","38-39","6","9.5","24.1"},
        {"8.5","39","6.5","9.6875","24.6"},
        {"9","39-40","7","9.875","25.1"},
        {"9.5","40","7.5","10","25.4"},
        {"10","40-41","8","10.1875","25.9"},
        {"10.5","41","8.5","10.3125","26.2"},
        {"11","41-42","9","10.5","26.7"},
        {"11.5","42","9.5","10.6875","27.1"},
        {"12","42-43","10","10.875","27.6"},
    };


    public CalculationOutput handleRequest(CalculationInput calculationInput) {

        try {
            String size = calculationInput.size;
            int index = calculationInput.type.getIndex();

            String[] matchedRow = null;
            for(String[] line : SIZE_MATRIX) {
                if (size.equalsIgnoreCase(line[index])) {
                    matchedRow = line;
                    break;
                }
            }
            if (matchedRow == null) {
                CalculationOutput calculationOutput = new CalculationOutput();
                calculationOutput.result = ResultCode.NotFound;
                return calculationOutput;
            }

            CalculationOutput calculationOutput = new CalculationOutput();
            calculationOutput.result = ResultCode.Success;
            for(SizeType sizeType : SizeType.values()) {
                calculationOutput.size.put(sizeType, matchedRow[sizeType.getIndex()]);
            }
            return calculationOutput;
        }catch (Exception e) {
            CalculationOutput calculationOutput = new CalculationOutput();
            calculationOutput.result = ResultCode.Error;
            return calculationOutput;
        }
    }

}