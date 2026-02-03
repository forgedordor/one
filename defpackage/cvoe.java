package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cvoe implements Comparable {
    public abstract cvof a();

    public abstract cvog b();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(((cvod) a()).a, ((cvod) ((cvoe) obj).a()).a);
    }
}
