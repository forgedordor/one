package defpackage;

import java.io.Reader;
import java.io.StreamTokenizer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cplk {
    final /* synthetic */ cplo a;

    public cplk(cplo cploVar) {
        this.a = cploVar;
    }

    public final void a(StreamTokenizer streamTokenizer, Reader reader, femm femmVar) throws femo {
        cplo.f(streamTokenizer, reader, 58);
        cplo.f(streamTokenizer, reader, -3);
        cple cpleVar = (cple) femmVar;
        cplf cplfVar = cpleVar.d;
        String str = streamTokenizer.sval;
        if (cplfVar.g != null) {
            fena fenaVar = cpleVar.a;
            cplfVar.h = fena.a(str);
        } else {
            fena fenaVar2 = cpleVar.a;
            cplfVar.g = fena.a(str);
        }
        cplo.f(streamTokenizer, reader, 10);
        this.a.d.a(streamTokenizer, reader, femmVar);
        cplo.f(streamTokenizer, reader, 58);
        cplo.e(streamTokenizer, reader, str, false);
        cplo.f(streamTokenizer, reader, 10);
        femz femzVar = cplfVar.g;
        if (femzVar == null) {
            throw new femy("Expected component not initialised");
        }
        femz femzVar2 = cplfVar.h;
        if (femzVar2 == null) {
            fems femsVar = cplfVar.f;
            femsVar.getClass();
            femsVar.b.add(femzVar);
            femz femzVar3 = cplfVar.g;
            if (femzVar3 instanceof fesp) {
                cplfVar.d.b(new ferg((fesp) femzVar3));
            }
            cplfVar.g = null;
            return;
        }
        if (femzVar instanceof fesp) {
            ((fesp) femzVar).c.add(femzVar2);
        } else if (femzVar instanceof fesg) {
            ((fesg) femzVar).c.add(femzVar2);
        } else if (femzVar instanceof fesy) {
            ((fesy) femzVar).c.add(femzVar2);
        } else if (femzVar instanceof ferx) {
            ((ferx) femzVar).c.add(femzVar2);
        }
        cplfVar.h = null;
    }
}
