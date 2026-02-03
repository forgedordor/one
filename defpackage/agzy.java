package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agzy {
    public static final cczi a = cdag.m(cdag.b, "disable_popups_for_hawkeye", false);
    public static final cqce b = cqce.g("Bugle", "PopupHost");
    public static final long c = TimeUnit.DAYS.toMillis(1);
    public final fcsu d;
    public final cogw e;
    public final egzh f;
    public final fcsu g;
    public agzt[] h = new agzt[0];
    public int i = -1;
    public int j;
    public agzt k;
    private final fcsu l;

    public agzy(fcsu fcsuVar, cogw cogwVar, egzh egzhVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.d = fcsuVar;
        this.e = cogwVar;
        this.f = egzhVar;
        this.g = fcsuVar2;
        this.l = fcsuVar3;
    }

    public final eiju a(boolean z) {
        if (!z) {
            return eijx.e(-1);
        }
        if (((Boolean) ((Optional) this.l.b()).map(new Function() { // from class: agzu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cczi ccziVar = agzy.a;
                return Boolean.valueOf(((aidh) obj).b());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue()) {
            b.m("Suppressing Popup for retail mode device");
            return eijx.e(-1);
        }
        final int i = this.i;
        if (i == -100) {
            this.i = -1;
            return eijx.e(-1);
        }
        if (i != -1) {
            this.i = -1;
            return this.h[i].b().h(new ejvr() { // from class: agzv
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    cczi ccziVar = agzy.a;
                    return Integer.valueOf(true != ((Boolean) obj).booleanValue() ? -1 : i);
                }
            }, eoqg.a);
        }
        int i2 = this.j;
        agzt[] agztVarArr = this.h;
        if (i2 < agztVarArr.length) {
            return agztVarArr[i2].b().i(new eooz() { // from class: agzw
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    agzy agzyVar = this.a;
                    if (zBooleanValue) {
                        return eijx.e(Integer.valueOf(agzyVar.j));
                    }
                    agzyVar.j++;
                    return agzyVar.a(true);
                }
            }, eoqg.a);
        }
        this.j = 0;
        return eijx.e(-1);
    }

    public final void b() {
        this.k = null;
    }

    public final boolean c() {
        long jE = ((crqv) this.d.b()).e("conversation_list_last_popup_show_timestamp_ms", 0L);
        return jE == 0 || this.e.f().toEpochMilli() >= jE + c;
    }

    public final boolean d() {
        return this.k != null;
    }

    public final void e(int i) {
        if (((Boolean) a.e()).booleanValue()) {
            return;
        }
        if (d()) {
            b.m("triggerPopup : Can't show " + ahab.a(i) + " popup as another popup is showing");
            ahac ahacVar = (ahac) this.g.b();
            this.k.getClass();
            fcsu fcsuVar = ahacVar.a;
            ((ains) fcsuVar.b()).e("Bugle.HomeScreen.PopupHost.Trigger.Suppressed", i - 1);
            ((ains) fcsuVar.b()).e("Bugle.HomeScreen.PopupHost.Trigger.Suppressor", r1.f() - 1);
            return;
        }
        int i2 = 0;
        while (true) {
            agzt[] agztVarArr = this.h;
            if (i2 >= agztVarArr.length) {
                b.m("triggerPopup : Popup name " + ahab.a(i) + " does not match with any valid popups");
                return;
            }
            if (i == agztVarArr[i2].f() && !d()) {
                b.m("triggerPopup : triggering new popup ".concat(ahab.a(i)));
                this.i = i2;
                this.f.a(eijx.e(null), "POPUP_KEY");
                return;
            }
            i2++;
        }
    }
}
