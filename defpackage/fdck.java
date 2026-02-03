package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdck {
    public static final String a(fdbm fdbmVar) {
        String string = fdbmVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
