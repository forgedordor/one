package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.sun.jna.Structure;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqbn extends Structure implements Structure.ByValue {
    public epzb value = new epzb();
    public int result = eqba.a.ordinal();
    public int context = eqbq.a.ordinal();

    @Override // com.sun.jna.Structure
    protected final List<String> getFieldOrder() {
        return fcva.g(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE, "result", "context");
    }
}
