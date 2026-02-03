package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class agrl extends Exception {
    public agrl(String str, Exception exc) {
        super("Penpal generated no results. Reason code: ".concat(str), exc);
    }
}
