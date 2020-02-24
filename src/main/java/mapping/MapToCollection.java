package mapping;
/**
 * This class represents an operation to be used in conjunction with the MapToCollection Interface
 *
 * <p> This interface describes one function used to define a mapping operation
 *
 * @author  Rob
 * @author  Sam
 */

import java.util.Collection;
import functional.Maybe;

public interface MapToCollection<CONTAINED_OBJECT_TYPE> {

    /**
     * Map all elements in this object using a transformation function to a collection
     *
     * <p> The method maps all elements in this object using a given transformation and returns the results as a collection.
     *
     * @param  mapOperation the transformation operation
     * @return a collection of transformed objects
     */
    public <MAP_RESULT_OBJECT_TYPE> Maybe<Collection<MAP_RESULT_OBJECT_TYPE>> maybeMapToCollectionWithOperation(MapableOperation<MAP_RESULT_OBJECT_TYPE, CONTAINED_OBJECT_TYPE> mapOperation);
}