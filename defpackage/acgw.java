package defpackage;

import android.content.Intent;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acgw implements dssw {
    public static final ejxr a = cdag.x("disable_growthkit_for_hawkeye_tests");
    private final fcsu b;
    private final fcsu c;
    private final eg d;
    private final fcsu e;
    private final agzy f;
    private String g;

    public acgw(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, eg egVar, agzy agzyVar) {
        this.e = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = egVar;
        this.f = agzyVar;
    }

    @Override // defpackage.dssw
    public final eg a() {
        return this.d;
    }

    @Override // defpackage.dssw
    public final dssv b(dssu dssuVar) {
        agzy agzyVar;
        if (((Boolean) ((cczi) a.get()).e()).booleanValue() || (((agzyVar = this.f) != null && agzyVar.d()) || ((Boolean) ((Optional) this.c.b()).map(new Function() { // from class: acgv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ejxr ejxrVar = acgw.a;
                return Boolean.valueOf(((aidh) obj).b());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue())) {
            return new dssv(false, 2);
        }
        Intent intent = (Intent) ((dssm) dssuVar).a.get(dssp.ACTION_POSITIVE);
        if (intent != null) {
            this.g = intent.getAction();
        }
        fcsu fcsuVar = this.b;
        if (!((Map) fcsuVar.b()).containsKey(this.g)) {
            return new dssv(true, 1);
        }
        ache acheVar = (ache) ((Map) fcsuVar.b()).get(this.g);
        acheVar.getClass();
        acheVar.a();
        return new dssv(false, 2);
    }

    @Override // defpackage.dssw
    public final /* synthetic */ ListenableFuture c(String str) {
        return eork.i(new dssq(str, new dssj()));
    }

    @Override // defpackage.dssw
    public final void d(dssp dsspVar) {
        fcsu fcsuVar = this.e;
        if (((Map) fcsuVar.b()).containsKey(this.g)) {
            achf achfVar = (achf) ((Map) fcsuVar.b()).get(this.g);
            achfVar.getClass();
            if (dsspVar == dssp.ACTION_POSITIVE) {
                achfVar.b(this.d);
            } else if (dsspVar == dssp.ACTION_DISMISS) {
                achfVar.a(this.d);
            }
        }
    }
}
