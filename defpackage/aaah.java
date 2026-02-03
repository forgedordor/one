package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaah {
    public final aaar a;
    public final fdae b;
    public final fdae c;
    public final fdap d;
    public final aaag e;
    public final fdap f;

    public aaah(aaar aaarVar, fdae fdaeVar, fdae fdaeVar2, fdap fdapVar, aaag aaagVar, fdap fdapVar2) {
        fdaeVar.getClass();
        fdaeVar2.getClass();
        fdapVar.getClass();
        aaagVar.getClass();
        this.a = aaarVar;
        this.b = fdaeVar;
        this.c = fdaeVar2;
        this.d = fdapVar;
        this.e = aaagVar;
        this.f = fdapVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaah)) {
            return false;
        }
        aaah aaahVar = (aaah) obj;
        return fdbq.f(this.a, aaahVar.a) && fdbq.f(this.b, aaahVar.b) && fdbq.f(this.c, aaahVar.c) && fdbq.f(this.d, aaahVar.d) && fdbq.f(this.e, aaahVar.e) && fdbq.f(this.f, aaahVar.f);
    }

    public final int hashCode() {
        int iHashCode = (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        fdap fdapVar = this.f;
        return (iHashCode * 31) + (fdapVar == null ? 0 : fdapVar.hashCode());
    }

    public final String toString() {
        return "ReactionBottomSheetPickerUiData(params=" + this.a + ", onDismiss=" + this.b + ", onCancel=" + this.c + ", onSelectEmoji=" + this.d + ", customStickerHandler=" + this.e + ", onCameraGalleryMediaSelected=" + this.f + ")";
    }

    public /* synthetic */ aaah(aaar aaarVar, fdae fdaeVar, fdae fdaeVar2, fdap fdapVar, aaag aaagVar, fdap fdapVar2, int i) {
        this(aaarVar, (i & 2) != 0 ? new fdae() { // from class: aaac
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        } : fdaeVar, (i & 4) != 0 ? new fdae() { // from class: aaad
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        } : fdaeVar2, (i & 8) != 0 ? new fdap() { // from class: aaae
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((String) obj).getClass();
                return fctx.a;
            }
        } : fdapVar, (i & 16) != 0 ? new aaag() { // from class: aaaf
            @Override // defpackage.aaag
            public final void a(dnvg dnvgVar) {
                dnvgVar.getClass();
            }
        } : aaagVar, (i & 32) != 0 ? null : fdapVar2);
    }
}
