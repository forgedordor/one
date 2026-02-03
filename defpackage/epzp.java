package defpackage;

import com.sun.jna.Structure;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epzp extends Structure implements Structure.ByValue {
    public byte isOk;
    public epzq union = new epzq();

    @Override // com.sun.jna.Structure
    protected final List<String> getFieldOrder() {
        return fcva.g("union", "isOk");
    }
}
