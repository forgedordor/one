package defpackage;

import android.net.Uri;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atox implements atsk {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateIconUrlConverter");
    private final fcsu b;

    public atox(fcsu fcsuVar) {
        this.b = fcsuVar;
    }

    @Override // defpackage.atsk
    public final /* synthetic */ auey a(Object obj, atrj atrjVar) {
        boolean z;
        audk audkVar = (audk) obj;
        audkVar.getClass();
        if (!((area) this.b.b()).a()) {
            auey aueyVar = auey.a;
            aueyVar.getClass();
            return aueyVar;
        }
        if (!fdbq.f(audkVar.d, atrjVar.o())) {
            throw new IllegalArgumentException("Mismatch between the RCS conversation Id from the GroupFullState and ConversationsTable");
        }
        auex auexVar = (auex) auey.a.createBuilder();
        auexVar.getClass();
        String str = audkVar.d;
        str.getClass();
        auez.b(str, auexVar);
        auey aueyVarA = auez.a(auexVar);
        if ((audkVar.c & 32) == 0) {
            ekrw ekrwVarE = a.e();
            ekrwVarE.X(eksq.a, "BugleGroupManagement");
            ekrd ekrdVar = (ekrd) ekrwVarE;
            ekrdVar.X(cqnc.s, atrjVar.f());
            ekrdVar.X(cqnc.N, atrjVar.o());
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateIconUrlConverter", "toGroupUpdate", 54, "GroupFullStateIconUrlConverter.kt")).q("Skipping group icon URL change because icon URL is missing in group full state");
            return aueyVarA;
        }
        audo audoVar = audkVar.j;
        if (audoVar == null) {
            audoVar = audo.a;
        }
        String str2 = audoVar.c;
        str2.getClass();
        Optional optionalK = atrjVar.k();
        final fdap fdapVar = new fdap() { // from class: atot
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                return ((Uri) obj2).toString();
            }
        };
        if (fdbq.f(str2, optionalK.map(new Function() { // from class: atou
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return fdapVar.invoke(obj2);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(""))) {
            ekrw ekrwVarE2 = a.e();
            ekrwVarE2.X(eksq.a, "BugleGroupManagement");
            ekrd ekrdVar2 = (ekrd) ekrwVarE2;
            ekrdVar2.X(cqnc.s, atrjVar.f());
            ekrdVar2.X(cqnc.N, atrjVar.o());
            ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateIconUrlConverter", "toGroupUpdate", 65, "GroupFullStateIconUrlConverter.kt")).q("Skipping group icon URL change because icon URL is the same on the client and server");
            return aueyVarA;
        }
        ekrg ekrgVar = a;
        ekrw ekrwVarE3 = ekrgVar.e();
        ekrz ekrzVar = eksq.a;
        ekrwVarE3.X(ekrzVar, "BugleGroupManagement");
        ekrd ekrdVar3 = (ekrd) ekrwVarE3;
        ekrdVar3.X(cqnc.s, atrjVar.f());
        ekrdVar3.X(cqnc.N, atrjVar.o());
        ekrd ekrdVar4 = (ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateIconUrlConverter", "toGroupUpdate", 73, "GroupFullStateIconUrlConverter.kt");
        String strAa = fdgn.aa(str2, 3);
        final fdap fdapVar2 = new fdap() { // from class: atov
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                return ((Uri) obj2).toString();
            }
        };
        String str3 = (String) optionalK.map(new Function() { // from class: atow
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return fdapVar2.invoke(obj2);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse("");
        ekrdVar4.D("Server icon URL (%s) and client icon URL (%s) do not match. Generating icon URL update GroupEvent.", strAa, str3 != null ? fdgn.aa(str3, 3) : null);
        evtg evtgVar = audkVar.h;
        evtgVar.getClass();
        if (evtgVar.isEmpty()) {
            z = false;
        } else {
            Iterator<E> it = evtgVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                auek auekVar = (auek) it.next();
                aubq aubqVar = auekVar.c;
                if (aubqVar == null) {
                    aubqVar = aubq.a;
                }
                if (fdbq.f(aubqVar, atrjVar.c())) {
                    aubq aubqVar2 = auekVar.c;
                    if (aubqVar2 == null) {
                        aubqVar2 = aubq.a;
                    }
                    aufb aufbVar = auekVar.e;
                    if (aufbVar == null) {
                        aufbVar = aufb.a;
                    }
                    aubq aubqVar3 = aufbVar.c;
                    if (aubqVar3 == null) {
                        aubqVar3 = aubq.a;
                    }
                    if (fdbq.f(aubqVar2, aubqVar3)) {
                        audo audoVar2 = audkVar.j;
                        if (audoVar2 == null) {
                            audoVar2 = audo.a;
                        }
                        aufb aufbVar2 = audoVar2.d;
                        if (aufbVar2 == null) {
                            aufbVar2 = aufb.a;
                        }
                        aubq aubqVar4 = aufbVar2.c;
                        if (aubqVar4 == null) {
                            aubqVar4 = aubq.a;
                        }
                        if (fdbq.f(aubqVar4, atrjVar.c())) {
                            z = true;
                        }
                    }
                }
            }
            z = false;
        }
        if (z) {
            ekrw ekrwVarH = ekrgVar.h();
            ekrwVarH.X(ekrzVar, "BugleGroupManagement");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateIconUrlConverter", "toGroupUpdate", 90, "GroupFullStateIconUrlConverter.kt")).q("Icon is from the group creation by myself.");
        }
        auex auexVar2 = (auex) aueyVarA.toBuilder();
        auexVar2.getClass();
        audq audqVar = (audq) audr.a.createBuilder();
        audqVar.getClass();
        auds.c(str2, audqVar);
        auds.d(str2.length() == 0, audqVar);
        audo audoVar3 = audkVar.j;
        if (audoVar3 == null) {
            audoVar3 = audo.a;
        }
        aufb aufbVar3 = audoVar3.d;
        if (aufbVar3 == null) {
            aufbVar3 = aufb.a;
        }
        aufbVar3.getClass();
        auds.b(aufbVar3, audqVar);
        audqVar.copyOnWrite();
        audr audrVar = (audr) audqVar.instance;
        audrVar.b |= 8;
        audrVar.f = z;
        auez.c(auds.a(audqVar), auexVar2);
        return auez.a(auexVar2);
    }
}
