package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;
import org.chromium.net.CronetException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class atbq {
    public static final eksp f = eksp.c("BugleFileTransfer");

    public static atbp g() {
        atbc atbcVar = new atbc();
        atbcVar.f(coid.FILE_TRANSFER_FAILURE_REASON_UNKNOWN);
        atbcVar.e(0);
        atbcVar.d(ekoj.a);
        atbcVar.g("");
        return atbcVar;
    }

    private final emwt l() {
        int i;
        emwt emwtVar = (emwt) emwy.a.createBuilder();
        coid coidVarB = b();
        switch (coidVarB) {
            case FILE_TRANSFER_FAILURE_REASON_UNKNOWN:
                i = 1;
                break;
            case FILE_TRANSFER_FAILURE_REASON_HTTP_REQUEST_FAILED:
                i = 2;
                break;
            case FILE_TRANSFER_FAILURE_REASON_EMPTY_HTTP_RESPONSE_BODY:
                i = 3;
                break;
            case FILE_TRANSFER_FAILURE_REASON_WRITING_TO_FILE_FAILED:
                i = 4;
                break;
            case FILE_TRANSFER_FAILURE_REASON_MESSAGE_NOT_FOUND:
                i = 5;
                break;
            case FILE_TRANSFER_FAILURE_REASON_INVALID_MESSAGE:
                i = 6;
                break;
            case FILE_TRANSFER_FAILURE_REASON_MANUAL_CANCELLATION:
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(coidVarB))));
            case FILE_TRANSFER_FAILURE_REASON_UNEXPECTED_CANCELLATION:
                i = 7;
                break;
            case FILE_TRANSFER_FAILURE_REASON_MAX_REDIRECTS_REACHED:
                i = 8;
                break;
            case FILE_TRANSFER_FAILURE_REASON_CLOSING_THE_FILE_FAILED:
                i = 9;
                break;
            case FILE_TRANSFER_FAILURE_REASON_OPENING_THE_FILE_FAILED:
                i = 10;
                break;
            case FILE_TRANSFER_FAILURE_REASON_FAILED_TO_PARSE_XML:
                i = 11;
                break;
            case FILE_TRANSFER_FAILURE_REASON_TACHYON_TOKEN_FAILURE:
                i = 12;
                break;
            case FILE_TRANSFER_FAILURE_REASON_INVALID_RCS_CONFIGURATION:
                i = 13;
                break;
            case FILE_TRANSFER_FAILURE_REASON_FAILED_TO_READ_HTTP_RESPONSE:
                i = 14;
                break;
            case FILE_TRANSFER_FAILURE_REASON_TRANSFER_EXCEPTION:
                i = 15;
                break;
            case FILE_TRANSFER_FAILURE_REASON_FAILED_TO_PREPARE_FILE:
                i = 16;
                break;
            case FILE_TRANSFER_FAILURE_REASON_FAILED_TO_GET_ACTIVE_TRANSPORT:
                i = 17;
                break;
            case FILE_TRANSFER_FAILURE_REASON_FAILED_TO_GET_FILE_SIZE:
                i = 18;
                break;
            case FILE_TRANSFER_FAILURE_REASON_FAILED_TO_READ_THUMBNAIL_INFO_IN_DB:
                i = 19;
                break;
            case FILE_TRANSFER_FAILURE_REASON_MISSING_THUMBNAIL:
                i = 20;
                break;
            case FILE_TRANSFER_FAILURE_REASON_FILE_NOT_FOUND_WHILE_TRYING_TO_DECRYPT:
                i = 21;
                break;
            case FILE_TRANSFER_FAILURE_REASON_FAILED_TO_INSERT_OR_UPDATE_FILE_TRANSFER_ENTRY_IN_DB:
                i = 22;
                break;
        }
        emwtVar.copyOnWrite();
        emwy emwyVar = (emwy) emwtVar.instance;
        emwyVar.e = i - 1;
        emwyVar.b |= 1;
        emwz emwzVar = (emwz) emxa.a.createBuilder();
        long jA = a();
        emwzVar.copyOnWrite();
        emxa emxaVar = (emxa) emwzVar.instance;
        emxaVar.b = 1 | emxaVar.b;
        emxaVar.c = jA;
        emwtVar.copyOnWrite();
        emwy emwyVar2 = (emwy) emwtVar.instance;
        emxa emxaVar2 = (emxa) emwzVar.build();
        emxaVar2.getClass();
        emwyVar2.f = emxaVar2;
        emwyVar2.b |= 2;
        return emwtVar;
    }

    public abstract int a();

    public abstract coid b();

    public abstract ekgp c();

    public abstract Optional d();

    public abstract Optional e();

    public abstract String f();

    public final emwy h() {
        final emwt emwtVarL = l();
        d().ifPresent(new Consumer() { // from class: atbo
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                eksp ekspVar = atbq.f;
                enof enofVarA = comy.a((CronetException) obj);
                emwt emwtVar = emwtVarL;
                emwtVar.copyOnWrite();
                emwy emwyVar = (emwy) emwtVar.instance;
                emwy emwyVar2 = emwy.a;
                enofVarA.getClass();
                emwyVar.g = enofVarA;
                emwyVar.b |= 4;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return (emwy) emwtVarL.build();
    }

    public final emwy i(emxe emxeVar) {
        final emwt emwtVarL = l();
        emwtVarL.copyOnWrite();
        emwy emwyVar = (emwy) emwtVarL.instance;
        emwy emwyVar2 = emwy.a;
        emxeVar.getClass();
        emwyVar.h = emxeVar;
        emwyVar.b |= 8;
        d().ifPresent(new Consumer() { // from class: atbk
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                eksp ekspVar = atbq.f;
                enof enofVarA = comy.a((CronetException) obj);
                emwt emwtVar = emwtVarL;
                emwtVar.copyOnWrite();
                emwy emwyVar3 = (emwy) emwtVar.instance;
                emwy emwyVar4 = emwy.a;
                enofVarA.getClass();
                emwyVar3.g = enofVarA;
                emwyVar3.b |= 4;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return (emwy) emwtVarL.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0080 A[PHI: r2
      0x0080: PHI (r2v2 int) = (r2v1 int), (r2v3 int) binds: [B:8:0x005a, B:14:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.emwy j(int r7, defpackage.emxe r8) {
        /*
            r6 = this;
            emwt r0 = r6.l()
            r0.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r1 = r0.instance
            emwy r1 = (defpackage.emwy) r1
            emwy r2 = defpackage.emwy.a
            r8.getClass()
            r1.h = r8
            int r8 = r1.b
            r8 = r8 | 8
            r1.b = r8
            r0.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r8 = r0.instance
            emwy r8 = (defpackage.emwy) r8
            int r1 = r8.b
            r1 = r1 | 16
            r8.b = r1
            r8.i = r7
            j$.util.Optional r7 = r6.d()
            atbn r8 = new atbn
            r8.<init>()
            r7.ifPresent(r8)
            coid r7 = r6.b()
            int r7 = r7.ordinal()
            r8 = 12
            r1 = 6
            if (r7 == r8) goto L94
            r8 = 15
            if (r7 == r8) goto L46
            goto Laf
        L46:
            j$.util.Optional r7 = r6.e()
            java.lang.Object r7 = r7.get()
            eycx r7 = (defpackage.eycx) r7
            eycw r7 = r7.a
            r7.getClass()
            int r8 = r7.ordinal()
            r2 = 2
            if (r8 == 0) goto L80
            r3 = 3
            r4 = 1
            if (r8 == r4) goto L7e
            r5 = 4
            if (r8 == r2) goto L7c
            r2 = 5
            if (r8 == r3) goto L80
            if (r8 == r5) goto L81
            if (r8 != r2) goto L6c
            r1 = r4
            goto L81
        L6c:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            java.lang.String r0 = "unknown enum value: "
            java.lang.String r7 = r0.concat(r7)
            r8.<init>(r7)
            throw r8
        L7c:
            r1 = r5
            goto L81
        L7e:
            r1 = r3
            goto L81
        L80:
            r1 = r2
        L81:
            r0.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r7 = r0.instance
            emwy r7 = (defpackage.emwy) r7
            int r1 = r1 + (-1)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            r7.d = r8
            r8 = 7
            r7.c = r8
            goto Laf
        L94:
            j$.util.Optional r7 = r6.e()
            java.lang.Object r7 = r7.get()
            eqco r7 = (defpackage.eqco) r7
            eqcs r7 = r7.a
            exzm r7 = defpackage.eqcw.a(r7)
            r0.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r8 = r0.instance
            emwy r8 = (defpackage.emwy) r8
            r8.d = r7
            r8.c = r1
        Laf:
            evsn r7 = r0.build()
            emwy r7 = (defpackage.emwy) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atbq.j(int, emxe):emwy");
    }

    public final String k() {
        return d().isPresent() ? (String) d().map(new Function() { // from class: atbl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((CronetException) obj).getMessage();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse("") : (String) e().map(new Function() { // from class: atbm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Throwable) obj).getMessage();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse("");
    }
}
