package defpackage;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epye extends Structure implements Structure.ByValue {
    public Callback destructor = epzj.INSTANCE;
    public Pointer size = new Pointer(0);
    public Pointer alignment = new Pointer(0);
    public eqaf run_getMessageContent_callback = new epyb();
    public eqag run_getMessageDeliveryStatusAsImdn_callback = new epyc();
    public eqah run_getMessageEpoch_callback = new epyd();
    public eqae run_generateMessageId_callback = new epya();

    @Override // com.sun.jna.Structure
    protected final List<String> getFieldOrder() {
        return fcva.g("destructor", "size", "alignment", "run_getMessageContent_callback", "run_getMessageDeliveryStatusAsImdn_callback", "run_getMessageEpoch_callback", "run_generateMessageId_callback");
    }
}
