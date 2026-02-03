package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqau extends Structure implements Structure.ByValue {
    public static final eqat Companion = new eqat();
    private static long a = Native.getNativeSize(eqau.class);
    public Pointer data = new Pointer(0);
    public epza len = new epza();

    @Override // com.sun.jna.Structure
    protected final List<String> getFieldOrder() {
        return fcva.g(GroupManagementRequest.DATA_TAG, "len");
    }
}
