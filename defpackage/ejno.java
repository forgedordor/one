package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejno implements ejmp {
    private final ejhj a;
    private final ekhx b = ekhx.v("/collection/athletes", "/collection/films", "/collection/film_series", "/collection/musical_groups", "/collection/music_group_members", "/collection/musicians", "/collection/restaurants", "/collection/sports_teams", "/collection/tv_episodes", "/collection/tv_programs", "/collection/bakeries", "/collection/cafes_and_coffee_shops", "/collection/ice_cream_parlors");

    public ejno(ejhj ejhjVar) {
        this.a = ejhjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ejmp
    public final ekgb a(ezdx ezdxVar, String str, ejqq ejqqVar) {
        ejwi ejwiVarJ;
        evtg evtgVar = ezdxVar.b;
        ArrayList<ejnp> arrayList = new ArrayList();
        if (!evtgVar.isEmpty()) {
            ekhx ekhxVar = this.b;
            if (!ekhxVar.isEmpty()) {
                ezdv ezdvVar = (ezdv) evtgVar.get(evtgVar.size() - 1);
                String str2 = ezdvVar.b == 30 ? (String) ezdvVar.c : "";
                if (!str2.isEmpty()) {
                    arrayList.add(new ejnp(str2, null, null, 0, 0));
                    for (ezds ezdsVar : ezdvVar.f) {
                        eyzy eyzyVarB = eyzy.b(ezdsVar.e);
                        if (eyzyVarB == null) {
                            eyzyVarB = eyzy.UNRECOGNIZED;
                        }
                        if (eyzyVarB == eyzy.WEBREF_ANNOTATION) {
                            String str3 = (ezdsVar.c == 9 ? (ezhg) ezdsVar.d : ezhg.a).c;
                            if (ekhxVar.contains(str3)) {
                                arrayList.add(new ejnp(str2, str3, (ezdsVar.c == 9 ? (ezhg) ezdsVar.d : ezhg.a).d, ezdsVar.h, ezdsVar.i));
                            }
                        }
                    }
                }
            }
        }
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        for (ejnp ejnpVar : arrayList) {
            String str4 = ejnpVar.a;
            Iterator<E> it = this.a.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    ejwiVarJ = ejud.a;
                    break;
                }
                ejhl ejhlVar = (ejhl) it.next();
                Iterator<E> it2 = ejhlVar.d.iterator();
                while (it2.hasNext()) {
                    if (str4.matches((String) it2.next())) {
                        ekgb ekgbVarR = ekoe.a;
                        if (ejnpVar.a()) {
                            String str5 = ejnpVar.b;
                            ejml ejmlVarH = ejmm.h();
                            ejmlVarH.f(str5);
                            ejmlVarH.e(ejnpVar.c);
                            ekgbVarR = ekgb.r(ejmlVarH.a());
                        }
                        ejmn ejmnVarF = ejmo.f();
                        ejmnVarF.c(ejhlVar.b == 2 ? (String) ejhlVar.c : "");
                        ejmnVarF.b(ekgbVarR);
                        ejmnVarF.d(1.0E-6f);
                        ejmnVarF.e(ezal.REGEXP);
                        ejwiVarJ = ejwi.j(ejmnVarF.a());
                    }
                }
            }
            if (ejwiVarJ.g() && !((ejmk) ejwiVarJ.c()).a.isEmpty()) {
                ekfwVar.h(ejwiVarJ.c());
            }
        }
        return ekfwVar.g();
    }

    @Override // defpackage.ejmp
    public final /* synthetic */ void b() {
    }
}
