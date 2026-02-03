package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mzn extends Handler {
    final /* synthetic */ mzp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzn(mzp mzpVar, Looper looper) {
        super(looper);
        this.a = mzpVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.a.h(obj, obj2);
            return;
        }
        mzp mzpVar = this.a;
        if (obj == mzpVar.g) {
            if (mzpVar.e == 2 || mzpVar.l()) {
                mzpVar.g = null;
                if (obj2 instanceof Exception) {
                    mzpVar.h.a((Exception) obj2, false);
                    return;
                }
                try {
                    mzpVar.b.g((byte[]) obj2);
                    mzw mzwVar = mzpVar.h;
                    mzwVar.b = null;
                    Set set = mzwVar.a;
                    ekgb ekgbVarN = ekgb.n(set);
                    set.clear();
                    int size = ekgbVarN.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        mzp mzpVar2 = (mzp) ekgbVarN.get(i2);
                        if (mzpVar2.m()) {
                            mzpVar2.f(true);
                        }
                    }
                } catch (Exception e) {
                    mzpVar.h.a(e, true);
                }
            }
        }
    }
}
