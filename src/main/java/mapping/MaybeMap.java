package mapping;
/**
 * This class extends HashMap to include the Maybe concept
 *
 * <p> This class extends Hash Map so that it returns Maybe Nothing by default instead of NULL. It should
 * be noted that the setter includes mapping it to a Maybe.
 *
 * @author  Rob
 * @author  Sam
 */

import functional.Maybe;
import javax.annotation.Nullable;
import java.util.HashMap;

public class MaybeMap<KEY_OBJECT, VALUE_OBJECT> extends HashMap<KEY_OBJECT, Maybe<VALUE_OBJECT>> {

    /*-------------------------------------------------------------------------------------------------
    * PUBLIC STATIC
    -------------------------------------------------------------------------------------------------*/

    /**
     * Constructor
    *
     * @return an empty MaybeMap
     */
    public static <KEY_OBJECT, VALUE_OBJECT> MaybeMap<KEY_OBJECT, VALUE_OBJECT> newMaybeMapWithAllKeysMappedToNothing() {
        return new MaybeMap<>();
    }

    /*-------------------------------------------------------------------------------------------------
    * PUBLIC
    -------------------------------------------------------------------------------------------------*/

    /**
     * Get a Maybe element from map
     *
     * <p> The method returns the element in a Maybe or Maybe Nothing if it does not exist
     *
     * @param  key the map key to look for
     * @return the object wrapped in Maybe or Maybe Nothing
     */
    @Nullable
    @Override
    public Maybe<VALUE_OBJECT> get(@Nullable Object key) {
        Maybe<VALUE_OBJECT> theMaybeObject = super.get(key);
        if (theMaybeObject == null) {
            return Maybe.asNothing();
        } else {
            return theMaybeObject;
        }
    }

    /*-------------------------------------------------------------------------------------------------
    * PRIVATE STATIC
    -------------------------------------------------------------------------------------------------*/
    private MaybeMap() {
        super();
    }
}
