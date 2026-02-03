package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class koj extends koe {
    final /* synthetic */ kok c;

    public koj(kok kokVar) {
        this.c = kokVar;
    }

    @Override // defpackage.koe
    protected final String d() {
        kog kogVar = (kog) this.c.a.get();
        if (kogVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + kogVar.a + "]";
    }
}
