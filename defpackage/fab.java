package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fab implements fac {
    public fad a;
    public iga b;
    private final jmj c;

    public fab(jmj jmjVar) {
        this.c = jmjVar;
    }

    public final fad a() {
        fad fadVar = this.a;
        if (fadVar != null) {
            return fadVar;
        }
        fdbq.c("keyboardActions");
        return null;
    }

    public final iga b() {
        iga igaVar = this.b;
        if (igaVar != null) {
            return igaVar;
        }
        fdbq.c("focusManager");
        return null;
    }

    public final boolean c(int i) {
        fdap fdapVar;
        jmj jmjVar;
        if (kdw.b(i, 7)) {
            fdapVar = a().b;
        } else {
            if (kdw.b(i, 2)) {
                a();
            } else if (kdw.b(i, 6)) {
                fdapVar = a().c;
            } else if (kdw.b(i, 5)) {
                a();
            } else if (kdw.b(i, 3)) {
                fdapVar = a().d;
            } else if (kdw.b(i, 4)) {
                fdapVar = a().e;
            } else if (!kdw.b(i, 1) && !kdw.b(i, 0)) {
                throw new IllegalStateException("invalid ImeAction");
            }
            fdapVar = null;
        }
        if (fdapVar != null) {
            fdapVar.invoke(this);
            return true;
        }
        if (kdw.b(i, 6)) {
            b().b(1);
            return true;
        }
        if (kdw.b(i, 5)) {
            b().b(2);
            return true;
        }
        if (!kdw.b(i, 7) || (jmjVar = this.c) == null) {
            return false;
        }
        jmjVar.a();
        return true;
    }
}
