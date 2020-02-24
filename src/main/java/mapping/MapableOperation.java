package mapping;
/**
 * This class represents an operation to be used in conjunction with the MapToCollection Interface
 *
 * <p> This interface describes one function used to define a mapping operation
 *
 * @author  Rob
 * @author  Sam
 */

import functional.Maybe;

public interface MapableOperation<TO_OBJECT_TYPE, FROM_OBJECT_TYPE> {

    /**
     * Take one arguement and transform this arguement
     *
     * <p> The method maps one object type to another
     *
     * @param  fromObjectInQeustion the object to be transformed
     * @return the transformed object.
     */
    public Maybe<TO_OBJECT_TYPE> applyMapOperation(FROM_OBJECT_TYPE fromObjectInQeustion);
}
