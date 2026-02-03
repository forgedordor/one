package defpackage;

import com.sun.jna.Structure;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epzn extends Structure implements Structure.ByValue {
    public byte isOk;
    public epzo union = new epzo();

    @Override // com.sun.jna.Structure
    protected final List<String> getFieldOrder() {
        return fcva.g("union", "isOk");
    }
}
