package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecyh extends ecyj {
    public final ejwi a;

    public ecyh(ejwi ejwiVar) {
        this.a = ejwiVar;
    }

    @Override // defpackage.ecyj
    public final ejwi a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ecyj) {
            ecyj ecyjVar = (ecyj) obj;
            ecyjVar.b();
            if (this.a.equals(ecyjVar.a())) {
                ecyjVar.d();
                ecyjVar.c();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return -1390203517;
    }

    public final String toString() {
        return "PhotoPickerConfig{enablePastProfilePhotos=false, openToContentUrl=Optional.absent(), showAccountSnackBar=false, editInfoDialogMessageId=2132086046}";
    }

    @Override // defpackage.ecyj
    public final void b() {
    }

    @Override // defpackage.ecyj
    public final void c() {
    }

    @Override // defpackage.ecyj
    public final void d() {
    }
}
