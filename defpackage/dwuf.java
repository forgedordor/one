package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwuf extends dwuj {
    private final dwvr a;

    public dwuf(dwvr dwvrVar) {
        this.a = dwvrVar;
    }

    @Override // defpackage.dwwj
    public final dwwl a() {
        return dwwl.MEDIA_ELEMENT;
    }

    @Override // defpackage.dwuj, defpackage.dwwj
    public final dwvr e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwwj) {
            dwwj dwwjVar = (dwwj) obj;
            if (dwwl.MEDIA_ELEMENT == dwwjVar.a() && this.a.equals(dwwjVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Element{mediaElement=" + this.a.toString() + "}";
    }
}
