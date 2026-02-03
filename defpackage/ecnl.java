package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecnl {
    public static final void a(String str, ecnm ecnmVar) {
        ejwl.f(!str.contains("PRAGMA"), "You should not include the PRAGMA in your statement: %s", str);
        ecnmVar.a.add(str);
    }
}
