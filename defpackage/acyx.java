package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class acyx {

    /* compiled from: PG */
    public interface a {
        ajsn J();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.acyx aj(final defpackage.adtz r18, defpackage.cogw r19) {
        /*
            Method dump skipped, instructions count: 1150
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acyx.aj(adtz, cogw):acyx");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.acyx ak(defpackage.bcut r7) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acyx.ak(bcut):acyx");
    }

    private static ejxr ao(final ConversationIdType conversationIdType, final String str, final boolean z) {
        final a aVar = (a) cqtf.a(a.class);
        return ejxx.a(new ejxr() { // from class: acyu
            @Override // defpackage.ejxr
            public final Object get() {
                return aVar.J().a(conversationIdType, str, z);
            }
        });
    }

    public abstract cins A();

    public abstract ejxr B();

    public abstract ezgd C();

    public abstract Optional D();

    public abstract String E();

    public abstract String F();

    public abstract String G();

    public abstract String H();

    public abstract String I();

    public abstract String J();

    public abstract String K();

    public abstract String L();

    public abstract String M();

    public abstract String N();

    public abstract String O();

    public abstract String P();

    public abstract String Q();

    public abstract String R();

    public abstract String S();

    public abstract String T();

    public abstract String U();

    public abstract String V();

    public abstract String W();

    public abstract String X();

    public abstract Function Y();

    public abstract boolean Z();

    public abstract int a();

    public abstract boolean aa();

    public abstract boolean ab();

    public abstract boolean ac();

    public abstract boolean ad();

    public abstract boolean ae();

    public abstract boolean af();

    public abstract boolean ag();

    public abstract boolean ah();

    public abstract boolean ai();

    public final String al(String str) {
        return (String) Y().apply(str);
    }

    public final boolean am() {
        Uri uriQ = ai() ? q() : r();
        return (uriQ == null || Uri.EMPTY.equals(uriQ)) ? false : true;
    }

    public final boolean an() {
        return !TextUtils.isEmpty(N()) && TextUtils.isEmpty(L()) && TextUtils.isEmpty(M());
    }

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract long l();

    public abstract long m();

    public abstract long n();

    public abstract long o();

    public abstract long p();

    public abstract Uri q();

    public abstract Uri r();

    public abstract akbj s();

    public abstract akbl t();

    public abstract aonp u();

    public abstract aukf v();

    public abstract ConversationIdType w();

    public abstract MessageIdType x();

    public abstract bvdk y();

    public abstract cgrc z();
}
