package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public interface cmqj {
    public static final Uri a = Uri.parse("content://mms/part");
    public static final Uri b = Uri.parse("content://mms-sms/canonical-address");

    static {
        Uri.parse("content://mms-sms/threadID");
    }

    @Deprecated
    String A(cmtz cmtzVar, String str);

    String B();

    @Deprecated
    String C(long j);

    String D(cnqj cnqjVar);

    String E();

    Map F();

    void G(Context context, Uri uri);

    void H(ctz ctzVar);

    void I(long j, long j2);

    @Deprecated
    void J(Uri uri, String str);

    void K(Uri uri, int i, long j);

    @Deprecated
    void L(long j, boolean z);

    void M(cnqj cnqjVar, boolean z);

    boolean N(long j, long j2);

    boolean O();

    boolean P(cnqj cnqjVar);

    boolean Q(Context context, Uri uri, int i, long j);

    boolean R(Uri uri, String str);

    String[] S(Context context, ll llVar);

    lz T(String[] strArr, MessageCoreData messageCoreData, ceah ceahVar, long j, int i, long j2, byte[] bArr);

    List U(String str);

    Uri V(Context context, lx lxVar, int i, String str, long j, long j2, String str2, int i2);

    Uri W(Context context, List list, MessageCoreData messageCoreData, ceah ceahVar, long j, int i, String str, long j2);

    void X(long j, long j2);

    void Y(Uri uri);

    void Z(Context context, Uri uri, long j);

    int a(Uri uri, String str);

    chvf aa(Context context, Uri uri, ly lyVar);

    boolean ab(Uri uri, int i, long j);

    void ac(Uri uri, long j);

    void ad();

    void ae(List list);

    @Deprecated
    Optional af(long j);

    List ag(String str);

    Optional ah(cmtz cmtzVar, String str);

    cmqi ai(Uri uri);

    Optional aj(cnqj cnqjVar);

    Uri ak(Context context, Uri uri, int i, String str, String str2, long j, int i2, int i3, cnqj cnqjVar, Optional optional);

    int b(long j);

    int c(ContentResolver contentResolver, String str, String str2);

    long d(Context context, String str);

    long e(Context context, Collection collection);

    long f(Context context, cmmp cmmpVar, String str);

    long g(Context context, cmmp cmmpVar, Collection collection);

    long h(Context context, cmmp cmmpVar, String str, awch awchVar);

    long i(Context context, cmmp cmmpVar, Collection collection, awch awchVar);

    long j(long j, long j2);

    Uri k(Context context, lx lxVar, int i, String str, long j, long j2, String str2);

    Uri l(Context context, lh lhVar, int i, String str, long j, Map map);

    Uri m(Context context, List list, MessageCoreData messageCoreData, ceah ceahVar, long j, int i, String str, long j2, byte[] bArr);

    Uri n(bbdl bbdlVar, MessageCoreData messageCoreData, long j);

    Uri o(bbdl bbdlVar, MessageCoreData messageCoreData);

    chvf p(Context context, Uri uri, int i, String str, String str2, Uri uri2, boolean z, long j, Bundle bundle, long j2);

    chvf q(Context context, Uri uri, int i, String str, String str2, String str3, boolean z, long j, lx lxVar, long j2);

    chvf r(alqm alqmVar, String str, Uri uri, int i, String str2, boolean z, MessageIdType messageIdType, long j);

    cmnu s(Uri uri, int i);

    cmny t(Uri uri);

    @Deprecated
    cmtz u(long j, String str, Integer num);

    cmtz v(cnqj cnqjVar, String str, Integer num);

    @Deprecated
    cmtz w(cmmp cmmpVar, long j, String str, Integer num);

    cmtz x(cmmp cmmpVar, cnqj cnqjVar, String str, Integer num);

    eiju y();

    String z(long j);
}
