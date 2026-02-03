package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anvf extends dqpi {
    public static final /* synthetic */ int a = 0;
    private final fdat b;

    public anvf(fdat fdatVar) {
        this.b = fdatVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dqpi
    public final /* synthetic */ Object d(dqwl dqwlVar, dqsd dqsdVar) {
        anuw anuwVar = new anuw(null);
        dqyd dqydVarC = dqsdVar.c();
        if (dqydVarC != null) {
            if (dqydVarC instanceof bsbr) {
                bsbo bsboVarE = ParticipantsTable.e();
                bsboVarE.A("StatelessParticipantChangeQueryListenerV2#preChangeInTransaction#1");
                bsboVarE.s();
                bsboVarE.e(new Function() { // from class: anvb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        brzh brzhVar = (brzh) obj;
                        int i = anvf.a;
                        return new brzi[]{brzhVar.a, brzhVar.d};
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                ekqh it = ((bsbr) dqydVarC).e.iterator();
                while (it.hasNext()) {
                    dqyj dqyjVar = (dqyj) it.next();
                    dqyjVar.getClass();
                    bsboVarE.k((bsbt) dqyjVar);
                }
                anuv.d(bsboVarE);
                bsboVarE.w(ParticipantsTable.c.a);
                bsboVarE.y(10);
                anuv.b(anuwVar, bsboVarE);
            }
            if (dqydVarC instanceof bsuo) {
                bsun bsunVarA = ProfilesTable.a();
                bsunVarA.A("StatelessParticipantChangeQueryListenerV2#preChangeInTransaction#1");
                bsunVarA.c(new Function() { // from class: anvc
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bstj bstjVar = (bstj) obj;
                        int i = anvf.a;
                        return new bstk[]{bstjVar.a, bstjVar.b};
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                ekqh it2 = ((bsuo) dqydVarC).e.iterator();
                while (it2.hasNext()) {
                    dqyj dqyjVar2 = (dqyj) it2.next();
                    dqyjVar2.getClass();
                    bsunVarA.k((bsuq) dqyjVar2);
                }
                anuv.e(bsunVarA);
                bsunVarA.w(ProfilesTable.c.b);
                bsunVarA.y(10);
                anuv.c(anuwVar, bsunVarA);
            }
        }
        dqyj dqyjVarD = dqsdVar.d();
        if (dqyjVarD != null) {
            if (dqyjVarD instanceof bsbt) {
                bsbo bsboVarE2 = ParticipantsTable.e();
                bsboVarE2.A("StatelessParticipantChangeQueryListenerV2#preChangeInTransaction#2");
                bsboVarE2.s();
                bsboVarE2.e(new Function() { // from class: anvd
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        brzh brzhVar = (brzh) obj;
                        int i = anvf.a;
                        return new brzi[]{brzhVar.a, brzhVar.d};
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bsboVarE2.k((bsbt) dqyjVarD);
                anuv.d(bsboVarE2);
                bsboVarE2.w(ParticipantsTable.c.a);
                bsboVarE2.y(10);
                anuv.b(anuwVar, bsboVarE2);
            }
            if (dqyjVarD instanceof bsuq) {
                bsun bsunVarA2 = ProfilesTable.a();
                bsunVarA2.A("StatelessParticipantChangeQueryListenerV2#preChangeInTransaction#2");
                bsunVarA2.c(new Function() { // from class: anve
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bstj bstjVar = (bstj) obj;
                        int i = anvf.a;
                        return new bstk[]{bstjVar.a, bstjVar.b};
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bsunVarA2.k((bsuq) dqyjVarD);
                anuv.e(bsunVarA2);
                bsunVarA2.w(ProfilesTable.c.b);
                bsunVarA2.y(10);
                anuv.c(anuwVar, bsunVarA2);
            }
        }
        return anuwVar;
    }

    @Override // defpackage.dqpi
    public final /* synthetic */ void e(dqwl dqwlVar, dqsd dqsdVar, Object obj) {
        final ParticipantsTable.BindData bindDataB;
        obj.getClass();
        anuw anuwVar = (anuw) obj;
        dqpd dqpdVarB = dqsdVar.b();
        if (dqpdVarB != null) {
            if (dqpdVarB instanceof ParticipantsTable.BindData) {
                bindDataB = (ParticipantsTable.BindData) dqpdVarB;
            } else {
                bindDataB = ParticipantsTable.b(String.valueOf(((ProfilesTable.BindData) dqpdVarB).o()));
                bindDataB.getClass();
            }
            if (bindDataB.r() > -2) {
                anuwVar.b.set(true);
            } else if (bindDataB.R() != null) {
                String[] strArr = boiv.a;
                boiq boiqVar = new boiq(boiv.a);
                boiqVar.A("StatelessParticipantChangeQueryListenerV2#onChangeInTransaction");
                boiqVar.s();
                boiqVar.e(new Function() { // from class: anux
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        int i = anvf.a;
                        return ((boic) obj2).a;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                boiqVar.f(new Function() { // from class: anuy
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        boiu boiuVar = (boiu) obj2;
                        int i = anvf.a;
                        String strR = bindDataB.R();
                        strR.getClass();
                        boiuVar.e(Long.parseLong(strR));
                        return boiuVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                boiqVar.y(10);
                anuv.a(anuwVar, boiqVar.b());
            }
        }
        dqpd[] dqpdVarArrA = dqsdVar.a();
        if (dqpdVarArrA != null) {
            fcur.M(dqpdVarArrA);
            fcww fcwwVar = new fcww((byte[]) null);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : fcwwVar) {
                if (obj2 instanceof ParticipantsTable.BindData) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj3;
                if (bindData.r() <= -2 && bindData.R() != null) {
                    arrayList2.add(obj3);
                }
            }
            ArrayList arrayList3 = new ArrayList(fcva.p(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                String strR = ((ParticipantsTable.BindData) it.next()).R();
                strR.getClass();
                arrayList3.add(Long.valueOf(Long.parseLong(strR)));
            }
            fcwwVar.addAll(arrayList3);
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : fcwwVar) {
                if (obj4 instanceof ProfilesTable.BindData) {
                    arrayList4.add(obj4);
                }
            }
            ArrayList arrayList5 = new ArrayList(fcva.p(arrayList4, 10));
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                arrayList5.add(Long.valueOf(((ProfilesTable.BindData) it2.next()).o()));
            }
            fcwwVar.addAll(arrayList5);
            final List listA = fcva.a(fcwwVar);
            if (!listA.isEmpty()) {
                String[] strArr2 = boiv.a;
                boiq boiqVar2 = new boiq(boiv.a);
                boiqVar2.A("StatelessParticipantChangeQueryListenerV2#onChangeInTransaction");
                boiqVar2.s();
                boiqVar2.e(new Function() { // from class: anuz
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj5) {
                        int i = anvf.a;
                        return ((boic) obj5).a;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                boiqVar2.f(new Function() { // from class: anva
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj5) {
                        boiu boiuVar = (boiu) obj5;
                        int i = anvf.a;
                        boiuVar.f(listA);
                        return boiuVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                boiqVar2.y(10);
                anuv.a(anuwVar, boiqVar2.b());
            }
            if (((fcww) listA).c != dqpdVarArrA.length) {
                anuwVar.b.set(true);
            }
        }
        Set set = anuwVar.a;
        if (set.isEmpty() && !anuwVar.b.get()) {
            return;
        }
        this.b.a(ekfv.f(set), Boolean.valueOf(anuwVar.b.get()));
    }
}
