package defpackage;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epxf extends Structure implements Structure.ByValue {
    public Callback destructor = epzg.INSTANCE;
    public Pointer size = new Pointer(0);
    public Pointer alignment = new Pointer(0);
    public epzy run_state_callback = new epxd();
    public epzw run_epoch_callback = new epxb();
    public epzz run_write_callback = new epxe();
    public epzx run_maxEpochId_callback = new epxc();
    public epzu run_deleteExpired_callback = new epwz();
    public epzv run_deleteGroup_callback = new epxa();
    public epzt run_addEmptyEpochRecord_callback = new epwy();

    @Override // com.sun.jna.Structure
    protected final List<String> getFieldOrder() {
        return fcva.g("destructor", "size", "alignment", "run_state_callback", "run_epoch_callback", "run_write_callback", "run_maxEpochId_callback", "run_deleteExpired_callback", "run_deleteGroup_callback", "run_addEmptyEpochRecord_callback");
    }
}
