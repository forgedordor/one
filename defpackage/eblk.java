package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eblk extends eblf {
    private final String f = "127.0.0.1";
    private final int g = 5600;
    private final String h = "127.0.0.1";
    private final int i = 5600;

    @Override // defpackage.eblf
    public final int i() {
        return this.g;
    }

    @Override // defpackage.eblf
    public final int j() {
        return this.i;
    }

    @Override // defpackage.eblf
    public final eblm k(ebqq ebqqVar, eblu ebluVar) throws ebmn {
        throw new ebmn("Can't send message - Stub SIP Stack");
    }

    @Override // defpackage.eblf
    public final eblm l(ebqq ebqqVar) throws ebmn {
        throw new ebmn("Can't send message - Stub SIP Stack");
    }

    @Override // defpackage.eblf
    public final String n() {
        return this.f;
    }

    @Override // defpackage.eblf
    public final String o() {
        return this.h;
    }

    @Override // defpackage.eblf
    public final String p() {
        return "UDP";
    }

    @Override // defpackage.eblf
    public final void s(ebqq ebqqVar) throws ebmn {
        throw new ebmn("Can't send message - Stub SIP Stack");
    }

    @Override // defpackage.eblf
    public final boolean v() {
        return true;
    }
}
