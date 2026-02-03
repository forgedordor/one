package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.R;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class cubg extends fdbb implements fdau {
    public cubg(Object obj) {
        super(3, obj, cubl.class, "transformToRowUiData", "transformToRowUiData(Ljava/lang/String;Lcom/google/android/apps/messaging/startchat/tracker/ContactSelectionState;)Lcom/google/android/apps/messaging/startchat/suggestion/ProfileSuggestionUiData;", 4);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        final String str = (String) obj;
        final cudx cudxVar = (cudx) obj2;
        final cubl cublVar = (cubl) this.b;
        fctc fctcVarA = fctd.a(new fdae() { // from class: cubd
            @Override // defpackage.fdae
            public final Object invoke() {
                return cublVar.b(str);
            }
        });
        cubn cubnVar = null;
        if (cublVar.e.k(str) && !cudxVar.b(cubl.c(fctcVarA)) && (!((aquo) cublVar.g.b()).a() || !cubl.c(fctcVarA).b().isPresent())) {
            final alqm alqmVarC = cubl.c(fctcVarA);
            final chos chosVarA = ((chot) cublVar.d.b()).a(chpk.a);
            final fdci fdciVar = new fdci();
            Runnable runnable = new Runnable() { // from class: cube
                @Override // java.lang.Runnable
                public final void run() {
                    djyu djylVar;
                    cubl.a.m("Creating profile UI response");
                    antq antqVar = chosVarA;
                    antqVar.d();
                    chos chosVar = (chos) antqVar;
                    Uri uriM = chosVar.h.a;
                    cubl cublVar2 = cublVar;
                    if (uriM == null) {
                        uriM = cpbr.m(cublVar2.b);
                        uriM.getClass();
                    }
                    Uri uri = uriM;
                    alqm alqmVar = alqmVarC;
                    String string = cublVar2.b.getString(R.string.phone_number_suggestion_prefix);
                    chpb chpbVar = chosVar.g;
                    Object objB = chsk.b(chpbVar.c, chpbVar.e, chpq.PROFILE_PEOPLE_SHARING_SOURCE);
                    if (objB == null) {
                        objB = alqmVar.G(true);
                        objB.getClass();
                        if (((aqiu) cublVar2.i.b()).a()) {
                            objB = cssf.b(objB.toString(), false);
                        }
                    }
                    String str2 = String.format("%s %s", Arrays.copyOf(new Object[]{string, objB}, 2));
                    str2.getClass();
                    String strValueOf = String.valueOf(alqmVar.m(true));
                    if (((aqiu) cublVar2.i.b()).a()) {
                        strValueOf = cssf.b(strValueOf, false);
                    }
                    String str3 = strValueOf;
                    cudx cudxVar2 = cudxVar;
                    if (cudxVar2.d.e()) {
                        dkrk dkrkVar = new dkrk(new dkpf(uri, null, null, 0, null, 30), null, 0, 0, 0.0f, null, 62);
                        str3.getClass();
                        djylVar = new djys(dkrkVar, str2, str3, cudxVar2.b(alqmVar), ((cuar) cublVar2.c.b()).b(antqVar, alqmVar, cudxVar2), new djyo(cublVar2.h.a()));
                    } else {
                        djylVar = new djyl(new dkrk(new dkpf(uri, null, null, 0, null, 30), null, 0, 0, 0.0f, null, 62), str2, str3, null, ((cuar) cublVar2.c.b()).b(antqVar, alqmVar, cudxVar2), new djyo(cublVar2.h.a()), 24);
                    }
                    fdciVar.a = new ctzh("phone_number", djylVar);
                }
            };
            String[] strArr = new String[0];
            eilt eiltVar = cublVar.f;
            eieh eiehVarC = eilt.c();
            if (eiehVarC != null) {
                try {
                    eiltVar.b(runnable, strArr);
                } finally {
                    eidc.a(eiehVarC);
                }
            } else {
                eiltVar.b(runnable, strArr);
            }
            cubnVar = (cubn) fdciVar.a;
        }
        return new cuba(cubnVar);
    }
}
