package defpackage;

import android.content.Context;
import android.telephony.ims.ImsRegistrationAttributes;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgak {
    private final Context a;
    private final deyw b;

    public dgak(Context context, deyw deywVar) {
        this.a = context;
        this.b = deywVar;
    }

    public static final int c(int i) {
        if (i != 1) {
            return i != 2 ? 1 : 3;
        }
        return 2;
    }

    public final void a(ewif ewifVar) {
        ewig ewigVar = (ewig) ewih.a.createBuilder();
        ewigVar.copyOnWrite();
        ewih ewihVar = (ewih) ewigVar.instance;
        ewihVar.f = 6;
        ewihVar.b |= 2;
        ewigVar.copyOnWrite();
        ewih ewihVar2 = (ewih) ewigVar.instance;
        ewihVar2.g = 2;
        ewihVar2.b |= 4;
        ewigVar.copyOnWrite();
        ewih ewihVar3 = (ewih) ewigVar.instance;
        ewifVar.getClass();
        ewihVar3.d = ewifVar;
        ewihVar3.c = 8;
        this.b.h(this.a, (ewih) ewigVar.build());
    }

    final void b(ImsRegistrationAttributes imsRegistrationAttributes, boolean z) {
        final ewha ewhaVar = (ewha) ewhd.a.createBuilder();
        Collection.EL.stream(imsRegistrationAttributes.getFeatureTags()).forEach(new Consumer() { // from class: dgaj
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ewgp ewgpVarA = dgam.a((String) obj);
                ewha ewhaVar2 = ewhaVar;
                ewhaVar2.copyOnWrite();
                ewhd ewhdVar = (ewhd) ewhaVar2.instance;
                ewhd ewhdVar2 = ewhd.a;
                ewgpVarA.getClass();
                evsx evsxVar = ewhdVar.c;
                if (!evsxVar.c()) {
                    ewhdVar.c = evsn.mutableCopy(evsxVar);
                }
                ewhdVar.c.h(ewgpVarA.z);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        int iC = c(imsRegistrationAttributes.getTransportType());
        ewhaVar.copyOnWrite();
        ewhd ewhdVar = (ewhd) ewhaVar.instance;
        ewhdVar.d = iC - 1;
        ewhdVar.b |= 1;
        int registrationTechnology = imsRegistrationAttributes.getRegistrationTechnology();
        int i = registrationTechnology != 0 ? registrationTechnology != 1 ? 1 : 3 : 2;
        int i2 = true == z ? 2 : 3;
        ewhaVar.copyOnWrite();
        ewhd ewhdVar2 = (ewhd) ewhaVar.instance;
        ewhdVar2.e = i - 1;
        ewhdVar2.b |= 2;
        ewid ewidVar = (ewid) ewif.a.createBuilder();
        ewidVar.copyOnWrite();
        ewif ewifVar = (ewif) ewidVar.instance;
        ewifVar.c = i2 - 1;
        ewifVar.b |= 1;
        ewidVar.copyOnWrite();
        ewif ewifVar2 = (ewif) ewidVar.instance;
        ewhd ewhdVar3 = (ewhd) ewhaVar.build();
        ewhdVar3.getClass();
        ewifVar2.d = ewhdVar3;
        ewifVar2.b |= 2;
        a((ewif) ewidVar.build());
    }
}
