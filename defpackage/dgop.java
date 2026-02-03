package defpackage;

import android.os.Message;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dgop implements dfmy, dgnu {
    @Override // defpackage.dfmy
    public String a() {
        throw null;
    }

    @Override // defpackage.dfmy
    @Deprecated
    public final boolean e(Message message) {
        return k(message, dgib.MSG_USE_ANDROID_OS_MESSAGE);
    }

    public abstract boolean k(Message message, dgib dgibVar);

    @Override // defpackage.dgnu
    public final /* bridge */ /* synthetic */ boolean v(Object obj, Object obj2) {
        dgib dgibVar = (dgib) obj;
        dgor dgorVar = (dgor) obj2;
        Message messageObtain = Message.obtain();
        if (((Boolean) dgom.a.a()).booleanValue()) {
            messageObtain.what = dgibVar.a();
            if (dgorVar != null) {
                messageObtain.arg1 = ((Integer) Optional.ofNullable(dgorVar.a).orElse(0)).intValue();
                messageObtain.arg2 = ((Integer) Optional.ofNullable(dgorVar.b).orElse(0)).intValue();
                Object obj3 = dgorVar.c;
                if (obj3 != null) {
                    messageObtain.obj = obj3;
                }
            }
        }
        return k(messageObtain, dgibVar);
    }

    @Override // defpackage.dfmy
    public final void d() {
    }
}
