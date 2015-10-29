/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.lro.models;

/**
 * The SubProductProperties model.
 */
public class SubProductProperties {
    /**
     * The provisioningState property.
     */
    private String provisioningState;

    /**
     * Possible values for this property include: 'Succeeded', 'Failed',
     * 'canceled', 'Accepted', 'Creating', 'Created', 'Updating', 'Updated',
     * 'Deleting', 'Deleted', 'OK'.
     */
    private String provisioningStateValues;

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */ 
    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     */
    public void setProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
    }

    /**
     * Get the provisioningStateValues value.
     *
     * @return the provisioningStateValues value
     */ 
    public String getProvisioningStateValues() {
        return this.provisioningStateValues;
    }

    /**
     * Set the provisioningStateValues value.
     *
     * @param provisioningStateValues the provisioningStateValues value to set
     */
    public void setProvisioningStateValues(String provisioningStateValues) {
        this.provisioningStateValues = provisioningStateValues;
    }

}
