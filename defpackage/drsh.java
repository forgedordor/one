package defpackage;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drsh extends log {
    final /* synthetic */ drsl a;

    public drsh(drsl drslVar) {
        this.a = drslVar;
    }

    @Override // defpackage.log
    public final void a(Throwable th) {
        Set set = this.a.h;
        synchronized (set) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((drsk) it.next()).b();
            }
        }
        this.a.i = 0L;
        ((ekrd) ((ekrd) drsl.a.i()).h("com/google/android/libraries/inputmethod/emoji/renderer/EmojiCompatManager$1", "onFailed", 236, "EmojiCompatManager.java")).q("EmojiCompat failed its initialization");
    }

    @Override // defpackage.log
    public final void b() {
        Set set = this.a.h;
        synchronized (set) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((drsk) it.next()).a();
            }
        }
        drsl drslVar = this.a;
        if (drslVar.i > 0) {
            SystemClock.elapsedRealtime();
            drslVar.i = 0L;
        }
        ((ekrd) ((ekrd) drsl.a.e()).h("com/google/android/libraries/inputmethod/emoji/renderer/EmojiCompatManager$1", "onInitialized", 218, "EmojiCompatManager.java")).q("EmojiCompat has been initialized");
    }
}
