package defpackage;

import java.io.IOException;
import java.io.InputStream;
import org.chromium.net.CronetException;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class coup {
    static coyk a(eycy eycyVar, couo couoVar, String str) {
        if (eycyVar == null) {
            atbp atbpVarG = atbq.g();
            atbpVarG.f(coid.FILE_TRANSFER_FAILURE_REASON_EMPTY_HTTP_RESPONSE_BODY);
            return new coyj(atbpVarG.a());
        }
        if (eycyVar.b()) {
            eycx eycxVar = eycyVar.a;
            if (eycxVar.a.equals(eycw.CANCELED)) {
                return coyh.a;
            }
            atbp atbpVarG2 = atbq.g();
            atbpVarG2.f(coid.FILE_TRANSFER_FAILURE_REASON_TRANSFER_EXCEPTION);
            atbpVarG2.c(eycxVar);
            atbpVarG2.g(str);
            Throwable cause = eycxVar.getCause();
            if (cause != null && (cause instanceof CronetException)) {
                atbpVarG2.b((CronetException) cause);
            }
            return new coyj(atbpVarG2.a());
        }
        if (!eycyVar.a()) {
            atbp atbpVarG3 = atbq.g();
            atbpVarG3.f(coid.FILE_TRANSFER_FAILURE_REASON_EMPTY_HTTP_RESPONSE_BODY);
            atbpVarG3.g(str);
            return new coyj(atbpVarG3.a());
        }
        eycf eycfVar = eycyVar.b;
        int i = eycfVar.a;
        if (i != 200) {
            atbp atbpVarG4 = atbq.g();
            atbpVarG4.f(coid.FILE_TRANSFER_FAILURE_REASON_HTTP_REQUEST_FAILED);
            atbpVarG4.g(str);
            atbpVarG4.e(i);
            return new coyj(atbpVarG4.a());
        }
        InputStream inputStream = eycfVar.c;
        if (inputStream == null) {
            atbp atbpVarG5 = atbq.g();
            atbpVarG5.f(coid.FILE_TRANSFER_FAILURE_REASON_EMPTY_HTTP_RESPONSE_BODY);
            atbpVarG5.g(str);
            return new coyj(atbpVarG5.a());
        }
        try {
            try {
                return couoVar.a((ezuk) ezuk.a.getParserForType().i(evqs.B(inputStream), evrr.a()));
            } catch (evtj e) {
                atbp atbpVarG6 = atbq.g();
                atbpVarG6.f(coid.FILE_TRANSFER_FAILURE_REASON_FAILED_TO_READ_HTTP_RESPONSE);
                atbpVarG6.g(str);
                atbpVarG6.c(e);
                return new coyj(atbpVarG6.a());
            }
        } catch (IOException e2) {
            atbp atbpVarG7 = atbq.g();
            atbpVarG7.f(coid.FILE_TRANSFER_FAILURE_REASON_FAILED_TO_READ_HTTP_RESPONSE);
            atbpVarG7.g(str);
            atbpVarG7.c(e2);
            return new coyj(atbpVarG7.a());
        }
    }
}
