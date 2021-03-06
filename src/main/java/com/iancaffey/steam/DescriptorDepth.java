package com.iancaffey.steam;

/**
 * DescriptorDepth
 * <p>
 * An object representing the depth to which return pertinent item information in offers.
 *
 * @author Ian Caffey
 * @since 1.0
 */
public enum DescriptorDepth {
    /**
     * Items returned in offers will not have any descriptions.
     */
    MINIMAL,
    /**
     * Items returned in offers will have complete descriptions.
     */
    THOROUGH
}
