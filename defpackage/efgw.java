package defpackage;

import com.android.vcard.VCardBuilder;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class efgw implements ebco {
    public static efgv f() {
        efgm efgmVar = new efgm();
        efgmVar.g("", "urn:ietf:params:cpim-headers:");
        return efgmVar;
    }

    private final String k() {
        return i().toString();
    }

    public abstract efgz a();

    public abstract ekfk b();

    /* JADX WARN: Type inference failed for: r2v5, types: [ebco, java.lang.Object] */
    @Override // defpackage.ebco
    public final InputStream d() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(k().getBytes(StandardCharsets.UTF_8));
        efgz efgzVarA = a();
        InputStream byteArrayInputStream2 = new ByteArrayInputStream(efgzVarA.e().getBytes(StandardCharsets.UTF_8));
        Optional optional = ((efgp) efgzVarA).b;
        if (optional.isPresent()) {
            byteArrayInputStream2 = new SequenceInputStream(byteArrayInputStream2, optional.get().d());
        } else {
            dhja.h(efgz.c, "MessageContent is null, returning only headers stream", new Object[0]);
        }
        return new SequenceInputStream(byteArrayInputStream, byteArrayInputStream2);
    }

    public abstract ekgb e();

    public final ekgb g() {
        int i = ekgb.d;
        final ekfw ekfwVar = new ekfw();
        Collection.EL.stream(e()).filter(new Predicate() { // from class: efgs
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                String strB = ((efhb) obj).b();
                return (ejwk.c(strB) || ejuf.e(strB, "urn:ietf:params:cpim-headers:") || ejuf.e(strB, "urn:ietf:params:imdn") || ejuf.e(strB, "http://id.messages.google.com")) ? false : true;
            }
        }).forEach(new Consumer() { // from class: efgt
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ekfwVar.h((efhb) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return ekfwVar.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Optional h(String str) {
        ekgb ekgbVarE = e();
        int i = ((ekoe) ekgbVarE).c;
        int i2 = 0;
        while (i2 < i) {
            efhb efhbVar = (efhb) ekgbVarE.get(i2);
            i2++;
            if (efhbVar.a().equals(str)) {
                return Optional.of(efhbVar);
            }
        }
        return Optional.empty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final StringBuilder i() {
        StringBuilder sb = new StringBuilder();
        ekqg ekqgVarListIterator = b().entrySet().listIterator();
        while (ekqgVarListIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
            if (!ejwk.c((String) entry.getKey())) {
                sb.append("NS: ");
                sb.append((String) entry.getKey());
                sb.append(" <");
                sb.append((String) entry.getValue());
                sb.append(">\r\n");
            }
        }
        ekod ekodVar = ((ekod) b()).d;
        ekgb ekgbVarE = e();
        int i = ((ekoe) ekgbVarE).c;
        for (int i2 = 0; i2 < i; i2++) {
            efhb efhbVar = (efhb) ekgbVarE.get(i2);
            String str = (String) ekodVar.get(efhbVar.b());
            if (!ejwk.c(str)) {
                sb.append(str);
                sb.append('.');
            }
            sb.append(efhbVar.a());
            sb.append(": ");
            sb.append(efhbVar.c());
            sb.append(VCardBuilder.VCARD_END_OF_LINE);
        }
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
        return sb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Optional j(String str) {
        ekgb ekgbVarE = e();
        int i = ((ekoe) ekgbVarE).c;
        for (int i2 = 0; i2 < i; i2++) {
            efhb efhbVar = (efhb) ekgbVarE.get(i2);
            if (efhbVar.a().equals(str) && "urn:ietf:params:imdn".equals(efhbVar.b())) {
                return Optional.of(efhbVar);
            }
        }
        return Optional.empty();
    }

    @Override // defpackage.ebco
    public final long l() {
        int length = k().length();
        efgz efgzVarA = a();
        return length + efgzVarA.e().length() + ((Long) ((efgp) efgzVarA).b.map(new Function() { // from class: efgx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(((ebco) obj).l());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(0L)).longValue();
    }
}
