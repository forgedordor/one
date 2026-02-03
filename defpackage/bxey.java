package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxey implements bajq {
    final /* synthetic */ fdos a;

    public bxey(fdos fdosVar) {
        this.a = fdosVar;
    }

    @Override // defpackage.bajq
    public final void a(bajr bajrVar) {
        ((ekrd) bxfa.a.i().h("com/google/android/apps/messaging/shared/datamodel/media/VCardCallbackFlow$get$1$1", "onPersonDataFailed", 28, "VCardCallbackFlow.kt")).q("Failed to parse vcard");
        this.a.b(null);
    }

    @Override // defpackage.bajq
    public final void b(bajr bajrVar) {
        ((ekrd) bxfa.a.e().h("com/google/android/apps/messaging/shared/datamodel/media/VCardCallbackFlow$get$1$1", "onPersonDataUpdated", 23, "VCardCallbackFlow.kt")).q("Parsed vcard successfully");
        this.a.b(new bxfb(bajrVar.m(), bajrVar.d()));
    }
}
