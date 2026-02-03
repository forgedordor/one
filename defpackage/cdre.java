package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdre {
    public final cmfo a;
    public final eosc b;

    public cdre(cmfo cmfoVar, eosc eoscVar) {
        this.a = cmfoVar;
        this.b = eoscVar;
    }

    public final eiju a() {
        return this.a.h().h(new ejvr() { // from class: cdqy
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cdrg cdrgVar = ((cdqu) obj).c;
                if (cdrgVar == null) {
                    cdrgVar = cdrg.a;
                }
                return Boolean.valueOf(cdrgVar.b);
            }
        }, this.b);
    }

    public final eiju b() {
        return this.a.h().h(new ejvr() { // from class: cdqz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cdri cdriVar = ((cdqu) obj).d;
                if (cdriVar == null) {
                    cdriVar = cdri.a;
                }
                return Long.valueOf(cdriVar.b);
            }
        }, this.b);
    }

    public final eiju c(final long j) {
        return this.a.j(new ejvr() { // from class: cdrc
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cdqu cdquVar = (cdqu) obj;
                cdri cdriVar = cdquVar.d;
                if (cdriVar == null) {
                    cdriVar = cdri.a;
                }
                long j2 = j;
                cdrh cdrhVar = (cdrh) cdriVar.toBuilder();
                cdrhVar.copyOnWrite();
                ((cdri) cdrhVar.instance).b = j2;
                cdri cdriVar2 = (cdri) cdrhVar.build();
                cdqt cdqtVar = (cdqt) cdquVar.toBuilder();
                cdqtVar.copyOnWrite();
                cdqu cdquVar2 = (cdqu) cdqtVar.instance;
                cdriVar2.getClass();
                cdquVar2.d = cdriVar2;
                cdquVar2.b |= 2;
                return (cdqu) cdqtVar.build();
            }
        }).h(new ejvr() { // from class: cdrd
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, this.b);
    }

    public final eiju d(final boolean z) {
        return this.a.j(new ejvr() { // from class: cdqv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cdqu cdquVar = (cdqu) obj;
                cdri cdriVar = cdquVar.d;
                if (cdriVar == null) {
                    cdriVar = cdri.a;
                }
                boolean z2 = z;
                cdrh cdrhVar = (cdrh) cdriVar.toBuilder();
                cdrhVar.copyOnWrite();
                ((cdri) cdrhVar.instance).c = z2;
                cdri cdriVar2 = (cdri) cdrhVar.build();
                cdqt cdqtVar = (cdqt) cdquVar.toBuilder();
                cdqtVar.copyOnWrite();
                cdqu cdquVar2 = (cdqu) cdqtVar.instance;
                cdriVar2.getClass();
                cdquVar2.d = cdriVar2;
                cdquVar2.b |= 2;
                return (cdqu) cdqtVar.build();
            }
        }).h(new ejvr() { // from class: cdra
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, this.b);
    }
}
