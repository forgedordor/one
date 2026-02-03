package defpackage;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yka implements yjt {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/messagelist/message/MessageUiDataPreloaderImpl");
    public final yir b;
    public final Set c;
    public final zqi d;
    private final fdjx e;
    private final fcyh f;
    private final int g;

    public yka(fdjx fdjxVar, fcyh fcyhVar, yir yirVar, zqi zqiVar, anej anejVar) {
        fdjxVar.getClass();
        fcyhVar.getClass();
        yirVar.getClass();
        zqiVar.getClass();
        anejVar.getClass();
        this.e = fdjxVar;
        this.f = fcyhVar;
        this.b = yirVar;
        this.d = zqiVar;
        int iA = anejVar.a();
        int iC = anejVar.c();
        int i = iA + iC + iC;
        this.g = i;
        this.c = ekpg.i();
        fdod.a(i, 0, 6);
        auvw.k(fdjxVar, fcyhVar, null, new yjz(this, null), 2);
    }

    @Override // defpackage.yjt
    public final void a(yjh yjhVar) {
        Set set = this.c;
        if (set.size() < this.g) {
            set.add(yjhVar);
            return;
        }
        ekrd ekrdVar = (ekrd) a.g();
        ekrdVar.V(1, TimeUnit.SECONDS);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/conversation2/messagelist/message/MessageUiDataPreloaderImpl", "add", 127, "MessageUiDataPreloaderImpl.kt")).q("MessageUiDataPreloader: not preloading message as the buffer is at capacity.");
    }
}
