package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cpnj implements eora {
    final /* synthetic */ int a;
    final /* synthetic */ cpnk b;

    public cpnj(cpnk cpnkVar, int i) {
        this.a = i;
        this.b = cpnkVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.b.j.e("Bugle.Cms.Backup.Disable.Success.Count", this.a);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        this.b.j.e("Bugle.Cms.Backup.Disable.Failure.Count", this.a);
        cpnk.a.s("Failed to disable CMS backup", th);
    }
}
