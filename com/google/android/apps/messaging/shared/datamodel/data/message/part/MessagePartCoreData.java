package com.google.android.apps.messaging.shared.datamodel.data.message.part;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import defpackage.athh;
import defpackage.baza;
import defpackage.bazc;
import defpackage.bvdq;
import defpackage.bvdr;
import defpackage.bvdt;
import defpackage.dqbw;
import defpackage.elha;
import defpackage.emop;

/* compiled from: PG */
/* loaded from: classes7.dex */
public interface MessagePartCoreData extends Parcelable, bazc {
    ConversationIdType A();

    MessageIdType B();

    baza C();

    MessagePartCoreData D();

    PartsTable.BindData E();

    bvdq F();

    bvdr G();

    bvdt H();

    LocationInformation I();

    dqbw J();

    elha K();

    emop L();

    String M();

    String N();

    String O();

    String P();

    String Q();

    String S();

    String T();

    String U();

    String V();

    String W();

    String X();

    String Y();

    String Z();

    int a();

    void aA(Uri uri);

    void aB(Uri uri);

    void aC(long j);

    void aD(athh athhVar);

    void aE(bvdt bvdtVar);

    void aF(String str);

    void aG(String str);

    void aH(long j);

    void aI(String str);

    void aJ(dqbw dqbwVar);

    void aK(VmtTable.BindData bindData);

    void aL(Context context);

    void aM(PartsTable.BindData bindData);

    void aN(ConversationIdType conversationIdType);

    void aO(MessageIdType messageIdType);

    void aP(String str);

    void aQ(MessagePartCoreData messagePartCoreData);

    boolean aR();

    boolean aS();

    boolean aT();

    boolean aU();

    boolean aV();

    boolean aW();

    boolean aY();

    boolean aZ();

    String aa();

    String ab();

    void ac();

    void ad();

    void ae();

    void ah();

    void ai();

    void aj(String str);

    void ak(emop emopVar);

    void al(String str);

    void am(long j);

    void an(String str);

    void ao(long j);

    void ap(byte[] bArr);

    void aq(String str);

    void ar(Uri uri);

    void as(ConversationIdType conversationIdType);

    void at(long j);

    void au(String str);

    void av(Uri uri);

    void aw(String str);

    void ax(bvdq bvdqVar);

    void ay(byte[] bArr);

    void az(bvdr bvdrVar);

    boolean bA(Uri uri);

    boolean bB(MessagePartCoreData messagePartCoreData);

    byte[] bC();

    byte[] bD();

    byte[] bE();

    byte[] bF();

    void bH();

    void bI();

    long bJ();

    void bK();

    boolean ba();

    boolean bb();

    boolean bc();

    boolean bd();

    boolean be();

    boolean bf();

    boolean bg();

    boolean bh();

    boolean bi();

    boolean bk();

    boolean bl();

    boolean bm();

    boolean bn();

    boolean bo();

    boolean bp();

    boolean bq();

    boolean br();

    boolean bt();

    boolean bu();

    boolean bv();

    boolean bw();

    boolean bx();

    long d();

    long e();

    long k();

    long l();

    long m();

    long n();

    long o();

    long p();

    long q();

    ContentValues r();

    Uri u();

    Uri v();

    Uri w();

    Uri x();

    athh z();
}
