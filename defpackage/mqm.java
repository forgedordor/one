package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class mqm {
    public final /* synthetic */ mrn a;

    public final void a(final mrw mrwVar) {
        final mrn mrnVar = this.a;
        mrnVar.f.b(new Runnable() { // from class: mqt
            @Override // java.lang.Runnable
            public final void run() throws CloneNotSupportedException {
                long jAb;
                mrw mrwVar2 = mrwVar;
                mrn mrnVar2 = mrnVar;
                int i = mrnVar2.o - mrwVar2.c;
                mrnVar2.o = i;
                boolean z = true;
                if (mrwVar2.d) {
                    mrnVar2.p = mrwVar2.e;
                    mrnVar2.q = true;
                }
                if (i == 0) {
                    mcl mclVar = mrwVar2.b.b;
                    if (!mrnVar2.C.b.q() && mclVar.q()) {
                        mrnVar2.D = -1;
                        mrnVar2.E = 0L;
                    }
                    if (!mclVar.q()) {
                        List listAsList = Arrays.asList(((mtg) mclVar).c);
                        int size = listAsList.size();
                        List list = mrnVar2.i;
                        mee.c(size == list.size());
                        for (int i2 = 0; i2 < listAsList.size(); i2++) {
                            ((mrm) list.get(i2)).a = (mcl) listAsList.get(i2);
                        }
                    }
                    long j = -9223372036854775807L;
                    if (mrnVar2.q) {
                        if (mrwVar2.b.c.equals(mrnVar2.C.c) && mrwVar2.b.e == mrnVar2.C.t) {
                            z = false;
                        }
                        if (z) {
                            if (mclVar.q() || mrwVar2.b.c.b()) {
                                jAb = mrwVar2.b.e;
                            } else {
                                mta mtaVar = mrwVar2.b;
                                jAb = mrnVar2.ab(mclVar, mtaVar.c, mtaVar.e);
                            }
                            j = jAb;
                        }
                    } else {
                        z = false;
                    }
                    mrnVar2.q = false;
                    mrnVar2.an(mrwVar2.b, 1, z, mrnVar2.p, j, -1, false);
                }
            }
        });
    }
}
