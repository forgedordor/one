package defpackage;

import com.sun.jna.Structure;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epzl extends Structure implements Structure.ByValue {
    public byte isOk;
    public epzm union = new epzm();

    @Override // com.sun.jna.Structure
    protected final List<String> getFieldOrder() {
        return fcva.g("union", "isOk");
    }
}
