package defpackage;

import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import java.util.logging.LogRecord;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ekuw extends LogRecord {
    private static final Object[] b;
    public final ektv a;
    private final eksx c;

    static {
        new ekuv();
        b = new Object[0];
    }

    protected ekuw(eksx eksxVar, ekte ekteVar) {
        super(eksxVar.m(), null);
        this.c = eksxVar;
        this.a = ektv.g(ekteVar, eksxVar.i());
        ekrq ekrqVarE = eksxVar.e();
        setSourceClassName(ekrqVarE.b());
        setSourceMethodName(ekrqVarE.d());
        setLoggerName(eksxVar.l());
        setMillis(TimeUnit.NANOSECONDS.toMillis(eksxVar.d()));
        super.setParameters(b);
    }

    public static void a(eksx eksxVar, StringBuilder sb) {
        sb.append("  original message: ");
        if (eksxVar.j() == null) {
            sb.append(ektc.b(eksxVar.k()));
        } else {
            sb.append(eksxVar.j().b);
            sb.append("\n  original arguments:");
            for (Object obj : eksxVar.S()) {
                sb.append("\n    ");
                sb.append(ektc.b(obj));
            }
        }
        ekte ekteVarI = eksxVar.i();
        if (ekteVarI.b() > 0) {
            sb.append("\n  metadata:");
            for (int i = 0; i < ekteVarI.b(); i++) {
                sb.append("\n    ");
                sb.append(ekteVarI.c(i).a);
                sb.append(": ");
                sb.append(ektc.b(ekteVarI.e(i)));
            }
        }
        sb.append("\n  level: ");
        sb.append(ektc.b(eksxVar.m()));
        sb.append("\n  timestamp (nanos): ");
        sb.append(eksxVar.d());
        sb.append("\n  class: ");
        sb.append(eksxVar.e().b());
        sb.append("\n  method: ");
        sb.append(eksxVar.e().d());
        sb.append("\n  line number: ");
        sb.append(eksxVar.e().a());
    }

    @Override // java.util.logging.LogRecord
    public final String getMessage() {
        String message = super.getMessage();
        if (message != null) {
            return message;
        }
        String strA = ekua.a.a(this.c, this.a);
        super.setMessage(strA);
        return strA;
    }

    @Override // java.util.logging.LogRecord
    public final void setMessage(String str) {
        if (str == null) {
            str = "";
        }
        super.setMessage(str);
    }

    @Override // java.util.logging.LogRecord
    public final void setParameters(Object[] objArr) {
        getMessage();
        if (objArr == null) {
            objArr = b;
        }
        super.setParameters(objArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" {\n  message: ");
        sb.append(getMessage());
        sb.append("\n  arguments: ");
        sb.append(getParameters() != null ? Arrays.asList(getParameters()) : "<none>");
        sb.append('\n');
        a(this.c, sb);
        sb.append("\n}");
        return sb.toString();
    }

    @Override // java.util.logging.LogRecord
    public final void setResourceBundle(ResourceBundle resourceBundle) {
    }

    @Override // java.util.logging.LogRecord
    public final void setResourceBundleName(String str) {
    }
}
