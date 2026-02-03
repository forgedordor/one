package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axcm extends cpec<awxn, UUID> implements Comparable<axcm> {
    public axcm(UUID uuid) {
        super(uuid);
    }

    public static axcm a(String str) {
        return new axcm(UUID.fromString(str));
    }

    public final String b() {
        return ((UUID) this.b).toString();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(axcm axcmVar) {
        return ((UUID) this.b).compareTo((UUID) axcmVar.b);
    }
}
