package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aixn {
    private final Context a;
    private final cqbm b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;

    public aixn(Context context, cqbm cqbmVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.a = context;
        this.b = cqbmVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
    }

    public final elhn a(int i) throws NumberFormatException {
        TelephonyManager telephonyManager;
        String networkOperator;
        elhn elhnVar = (elhn) elho.b.createBuilder();
        boolean zB = ((crny) this.d.b()).h(i).B();
        elhnVar.copyOnWrite();
        elho elhoVar = (elho) elhnVar.instance;
        int i2 = 4;
        elhoVar.c |= 4;
        elhoVar.f = zB;
        elhnVar.copyOnWrite();
        elho elhoVar2 = (elho) elhnVar.instance;
        elhoVar2.g = 0;
        int i3 = 8;
        elhoVar2.c |= 8;
        fcsu fcsuVar = this.c;
        boolean zE = ((crmx) ((cmtt) fcsuVar.b()).a.b()).E();
        elhnVar.copyOnWrite();
        elho elhoVar3 = (elho) elhnVar.instance;
        elhoVar3.c |= 16;
        elhoVar3.h = zE;
        boolean zA = ((crny) ((cmtt) fcsuVar.b()).b.b()).h(i).A();
        elhnVar.copyOnWrite();
        elho elhoVar4 = (elho) elhnVar.instance;
        elhoVar4.c |= 32;
        elhoVar4.i = zA;
        cqbm cqbmVar = this.b;
        boolean zV = ((cqey) cqbmVar.a()).v(i);
        elhnVar.copyOnWrite();
        elho elhoVar5 = (elho) elhnVar.instance;
        elhoVar5.c |= 128;
        elhoVar5.l = zV;
        boolean zP = ((cqey) cqbmVar.a()).p();
        elhnVar.copyOnWrite();
        elho elhoVar6 = (elho) elhnVar.instance;
        elhoVar6.c |= 64;
        elhoVar6.k = zP;
        if (((aqdb) this.e.b()).a() && (telephonyManager = (TelephonyManager) this.a.getSystemService("phone")) != null && (networkOperator = telephonyManager.getNetworkOperator()) != null && networkOperator.length() >= 3) {
            int i4 = Integer.parseInt(networkOperator.substring(0, 3));
            elhnVar.copyOnWrite();
            elho elhoVar7 = (elho) elhnVar.instance;
            elhoVar7.c |= 256;
            elhoVar7.m = i4;
            int i5 = Integer.parseInt(networkOperator.substring(3));
            elhnVar.copyOnWrite();
            elho elhoVar8 = (elho) elhnVar.instance;
            elhoVar8.c |= 512;
            elhoVar8.n = i5;
        }
        ekhx ekhxVarH = ((cqey) cqbmVar.a()).h();
        final aixm aixmVar = new aixm();
        Stream map = Collection.EL.stream(ekhxVarH).map(new Function() { // from class: aixk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (elhk) aixmVar.fM((cqex) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i6 = ekgb.d;
        Iterable iterable = (Iterable) map.collect(ekcv.a);
        elhnVar.copyOnWrite();
        elho elhoVar9 = (elho) elhnVar.instance;
        evsx evsxVar = elhoVar9.j;
        if (!evsxVar.c()) {
            elhoVar9.j = evsn.mutableCopy(evsxVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            elhoVar9.j.h(((elhk) it.next()).g);
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            elhnVar.copyOnWrite();
            elho elhoVar10 = (elho) elhnVar.instance;
            elhoVar10.e = 6;
            elhoVar10.c |= 2;
            elhnVar.copyOnWrite();
            elho elhoVar11 = (elho) elhnVar.instance;
            elhoVar11.d = 0;
            elhoVar11.c |= 1;
            return elhnVar;
        }
        switch (aixl.a[activeNetworkInfo.getDetailedState().ordinal()]) {
            case 1:
                i3 = 2;
                break;
            case 2:
                i3 = 3;
                break;
            case 3:
                i3 = 4;
                break;
            case 4:
                i3 = 5;
                break;
            case 5:
                i3 = 6;
                break;
            case 6:
                i3 = 7;
                break;
            case 7:
                break;
            case 8:
                i3 = 9;
                break;
            case 9:
                i3 = 10;
                break;
            case 10:
                i3 = 11;
                break;
            case 11:
                i3 = 12;
                break;
            case 12:
                i3 = 13;
                break;
            case 13:
                i3 = 14;
                break;
            default:
                i3 = 1;
                break;
        }
        elhnVar.copyOnWrite();
        elho elhoVar12 = (elho) elhnVar.instance;
        elhoVar12.e = i3 - 1;
        elhoVar12.c |= 2;
        int type = activeNetworkInfo.getType();
        if (type == 0) {
            i2 = 2;
        } else if (type == 1) {
            i2 = 3;
        } else if (type != 6) {
            i2 = 5;
        }
        elhnVar.copyOnWrite();
        elho elhoVar13 = (elho) elhnVar.instance;
        elhoVar13.d = i2 - 1;
        elhoVar13.c |= 1;
        return elhnVar;
    }

    public final elho b(int i) {
        return (elho) a(i).build();
    }
}
