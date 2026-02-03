package defpackage;

import java.io.Reader;
import java.io.StreamTokenizer;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class femg {
    final /* synthetic */ feml a;

    public femg(feml femlVar) {
        this.a = femlVar;
    }

    public final void a(StreamTokenizer streamTokenizer, Reader reader, femm femmVar) throws femo {
        feml femlVar = this.a;
        femlVar.b(streamTokenizer, reader, 58);
        femlVar.b(streamTokenizer, reader, -3);
        femb fembVar = (femb) femmVar;
        femc femcVar = fembVar.d;
        String str = streamTokenizer.sval;
        if (femcVar.c != null) {
            fena fenaVar = fembVar.a;
            femcVar.d = fena.a(str);
        } else {
            fena fenaVar2 = fembVar.a;
            femcVar.c = fena.a(str);
        }
        femlVar.b(streamTokenizer, reader, 10);
        femlVar.d.a(streamTokenizer, reader, femmVar);
        femlVar.b(streamTokenizer, reader, 58);
        femlVar.c(streamTokenizer, reader, str, false);
        femlVar.b(streamTokenizer, reader, 10);
        femz femzVar = femcVar.c;
        if (femzVar == null) {
            throw new femy("Expected component not initialised");
        }
        femz femzVar2 = femcVar.d;
        if (femzVar2 == null) {
            femcVar.b.b.add(femzVar);
            femz femzVar3 = femcVar.c;
            if (femzVar3 instanceof fesp) {
                femcVar.a.b(new ferg((fesp) femzVar3));
            }
            femcVar.c = null;
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
        femcVar.d = null;
    }
}
