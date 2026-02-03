package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eall {
    public final eant a;
    public final diep b;
    public final eamf c;
    public final ealr d;
    public final eanu e;
    private final euub f;
    private final ealm g;
    private final fbni h;

    public eall(eanu eanuVar, fbqm fbqmVar, eant eantVar, diep diepVar, eamf eamfVar, ealr ealrVar, ealm ealmVar, fbni fbniVar) {
        this.e = eanuVar;
        this.f = (euub) euub.h(new euua(), fbqmVar);
        this.g = ealmVar;
        this.a = eantVar;
        this.b = diepVar;
        this.c = eamfVar;
        this.d = ealrVar;
        this.h = fbniVar;
    }

    public final ListenableFuture a() {
        ejwl.m(this.e.c(), "ApiConfig must be initialized.");
        return eork.i(eaiu.a);
    }

    public final defn b(final eava eavaVar, final int i) {
        eaua eauaVar = (eaua) eavaVar;
        if (eauaVar.a.isEmpty()) {
            return degc.b(new dcff(new Status(9012, "Place id must not be an empty string.")));
        }
        List list = eauaVar.b;
        if (list.isEmpty()) {
            return degc.b(new dcff(new Status(9012, "Place fields must not be empty.")));
        }
        final long jA = this.b.a();
        ArrayList arrayList = new ArrayList(ealt.a(list));
        arrayList.add("attributions");
        final String strA = eako.a(arrayList, false, new ArrayList());
        final ListenableFuture listenableFutureA = a();
        final ListenableFuture listenableFutureG = eooq.g(listenableFutureA, new eooz() { // from class: ealf
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) throws PackageManager.NameNotFoundException {
                eall eallVar = this.a;
                euub euubVarC = eallVar.c(strA, (eaiu) obj);
                Locale localeB = eallVar.e.b();
                eust eustVar = eust.a;
                euss eussVar = (euss) eustVar.createBuilder();
                eussVar.copyOnWrite();
                ((eust) eussVar.instance).b = "places/".concat(((eaua) eavaVar).a);
                String languageTag = localeB.toLanguageTag();
                eussVar.copyOnWrite();
                eust eustVar2 = (eust) eussVar.instance;
                languageTag.getClass();
                eustVar2.c = languageTag;
                eust eustVar3 = (eust) eussVar.build();
                fbnd fbndVar = euubVarC.a;
                fbrk fbrkVar = euuc.d;
                if (fbrkVar == null) {
                    synchronized (euuc.class) {
                        fbrkVar = euuc.d;
                        if (fbrkVar == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.maps.places.v1.Places", "GetPlace");
                            fbrhVarA.b();
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(eustVar);
                            fbrhVarA.b = new fcrh(eutz.a);
                            fbrk fbrkVarA = fbrhVarA.a();
                            euuc.d = fbrkVarA;
                            fbrkVar = fbrkVarA;
                        }
                    }
                }
                return fcrw.a(fbndVar.a(fbrkVar, euubVarC.b), eustVar3);
            }
        }, eoqg.a);
        deem deemVar = eauaVar.c;
        if (deemVar != null) {
            deemVar.a(new defk() { // from class: ealg
                @Override // defpackage.defk
                public final void a() {
                    listenableFutureG.cancel(true);
                }
            });
        }
        return drgf.a(listenableFutureG).f(new defm() { // from class: ealh
            @Override // defpackage.defm
            public final defn a(Object obj) {
                defr defrVar = new defr();
                defrVar.b(new eaub(this.a.d.a((eutz) obj)));
                return defrVar.a;
            }
        }).d(new deeq() { // from class: eali
            @Override // defpackage.deeq
            public final Object a(defn defnVar) {
                if (((defv) defnVar).d) {
                    return defnVar;
                }
                ListenableFuture listenableFuture = listenableFutureA;
                int i2 = i;
                long j = jA;
                eall eallVar = this.a;
                eallVar.a.d(defnVar, j, eallVar.b.a(), 3, i2, (eaiu) ((eorv) listenableFuture).b);
                return defnVar;
            }
        });
    }

    public final euub c(String str, eaiu eaiuVar) throws PackageManager.NameNotFoundException {
        fbni[] fbniVarArr = new fbni[3];
        String strA = this.e.a();
        fbrg fbrgVar = new fbrg();
        fbqx fbqxVar = fbrg.c;
        int i = fbrb.d;
        fbrgVar.h(new fbqw("X-Goog-Api-Key", fbqxVar), strA);
        Context context = this.g.a;
        String strA2 = eawk.a(context.getPackageManager(), context.getPackageName());
        if (!TextUtils.isEmpty(strA2)) {
            fbrgVar.h(new fbqw("X-Android-Package", fbqxVar), context.getPackageName());
            fbrgVar.h(new fbqw("X-Places-Android-Sdk", fbqxVar), "4.3.1");
            fbrgVar.h(new fbqw("X-Android-Cert", fbqxVar), strA2);
        }
        if (!str.isEmpty()) {
            fbrgVar.h(new fbqw("X-Goog-FieldMask", fbqxVar), str);
        }
        euub euubVar = this.f;
        fbniVarArr[0] = new fcrz(fbrgVar);
        eaiuVar.b();
        fbniVarArr[1] = new fcrz(new fbrg());
        fbniVarArr[2] = this.h;
        return (euub) euubVar.m(fbniVarArr);
    }
}
