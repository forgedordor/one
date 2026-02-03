package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drom implements droc {
    public static final ekrg a = ekrg.c("com/google/android/libraries/inputmethod/emoji/data/StickyVariantsPreferences");
    public static volatile drom b;
    public final drnf c;
    public final Map d = new ConcurrentHashMap();
    public final Executor e = drle.a().f;
    public final drod f;
    public ListenableFuture g;
    public ListenableFuture h;

    public drom(Context context) {
        this.c = drnf.e(context);
        this.f = new drmt(context);
    }

    public final drnj a() {
        drni drniVar = (drni) drnj.a.createBuilder();
        drniVar.a(this.d);
        return (drnj) drniVar.build();
    }

    @Override // defpackage.droc
    public final ListenableFuture b() {
        return this.g;
    }

    @Override // defpackage.droc
    public final String c(String str) {
        throw null;
    }

    @Override // defpackage.droc
    public final boolean d(String str) {
        drnf drnfVar = this.c;
        Map map = this.d;
        String strD = drnfVar.d(str);
        if (str.equals((String) map.get(strD))) {
            return false;
        }
        map.put(strD, str);
        ((drmt) this.f).b(a());
        return true;
    }

    @Override // defpackage.droc
    public final int e() {
        return 1;
    }
}
