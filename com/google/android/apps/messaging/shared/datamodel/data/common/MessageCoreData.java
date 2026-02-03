package com.google.android.apps.messaging.shared.datamodel.data.common;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import defpackage.alqm;
import defpackage.aubq;
import defpackage.axcm;
import defpackage.baro;
import defpackage.basd;
import defpackage.baxt;
import defpackage.bazb;
import defpackage.brap;
import defpackage.brdu;
import defpackage.bvdx;
import defpackage.bvdz;
import defpackage.bvec;
import defpackage.cbqz;
import defpackage.cgvx;
import defpackage.cjnm;
import defpackage.ckdl;
import defpackage.ckfm;
import defpackage.ckwl;
import defpackage.clfy;
import defpackage.comc;
import defpackage.cpyi;
import defpackage.dzfh;
import defpackage.ekgb;
import defpackage.elwq;
import defpackage.eyga;
import defpackage.ezds;
import defpackage.fhaz;
import j$.time.Instant;
import j$.util.Optional;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes7.dex */
public interface MessageCoreData extends Parcelable, bazb {
    ConversationIdType A();

    baro B();

    MessageIdType C();

    MessageIdType D();

    basd E();

    basd F();

    baxt G();

    MessagePartCoreData H();

    MessagesTable.BindData J();

    brdu K();

    bvdx L();

    bvdx N();

    bvdz O();

    bvec P();

    cbqz Q();

    cgvx R();

    cjnm S();

    ckdl T();

    ckfm U();

    ckwl V();

    clfy W();

    cpyi X();

    dzfh Y();

    int a();

    String aA();

    String aB();

    String aC();

    String aD();

    String aE();

    String aF();

    UUID aI();

    fhaz aJ();

    void aK(ezds ezdsVar);

    void aL(String str, Object obj);

    void aM(MessagePartCoreData messagePartCoreData);

    void aN(MessagesTable.BindData bindData);

    void aO(brap brapVar);

    void aP(SelfIdentityId selfIdentityId);

    void aQ(SelfIdentityId selfIdentityId);

    void aR(String str);

    void aS();

    void aT();

    void aU(long j);

    void aV(long j, comc comcVar);

    void aW(long j, comc comcVar);

    void aX(Instant instant);

    void aY(long j);

    void aZ(long j);

    ekgb aa();

    ekgb ab();

    eyga ac();

    Instant ad();

    Optional ae();

    Optional af();

    Optional ag();

    Optional ah();

    String ai();

    String aj();

    String ak();

    String al();

    String am();

    String an();

    String ao();

    String ap();

    String aq();

    String as();

    String at();

    String au();

    String av();

    String aw();

    String ax();

    String az();

    int b();

    void bA(Optional optional);

    void bB(boolean z);

    void bC();

    void bD(Uri uri);

    void bE(MessageUsageStatisticsData messageUsageStatisticsData);

    void bF(long j);

    void bG(basd basdVar);

    void bH(bvdx bvdxVar);

    void bI(bvdx bvdxVar);

    void bJ(Instant instant);

    void bK(int i);

    void bL(long j);

    void bM(alqm alqmVar);

    void bN(clfy clfyVar);

    void bO(int i);

    void bP(alqm alqmVar);

    void bQ(long j);

    void bR(int i);

    void bS(String str);

    void bT(long j);

    void bU(int i);

    void bV(fhaz fhazVar);

    void bW(long j);

    void bX(String str, List list);

    void bY(MessagesTable.BindData bindData);

    void bZ(String str);

    void bb(long j);

    void bc(long j);

    void bd(long j);

    void be(long j);

    void bf(long j);

    void bg(long j);

    void bh();

    void bi(long j);

    void bj(long j);

    void bk(long j);

    void bl(long j);

    void bm(long j);

    void bn();

    void bo(baxt baxtVar);

    void bp(String str);

    void bq(String str);

    void br(cpyi cpyiVar);

    void bs(eyga eygaVar);

    void bt(UUID uuid);

    void bu(cbqz cbqzVar);

    void bv(elwq elwqVar);

    void bw(cgvx cgvxVar);

    void bx(boolean z);

    void by();

    void bz(boolean z);

    int c();

    boolean cA();

    boolean cB();

    boolean cC();

    boolean cD();

    boolean cE();

    boolean cF();

    boolean cG(long j);

    boolean cH(long j);

    boolean cI();

    boolean cK();

    boolean cM();

    boolean cN();

    boolean cO();

    boolean cQ();

    boolean cS();

    boolean cV();

    boolean cW();

    boolean cX();

    boolean cY();

    boolean cZ();

    void ca(bvec bvecVar);

    void cb();

    void cc(MessageIdType messageIdType);

    void cd(basd basdVar);

    void ce(ConversationIdType conversationIdType, Uri uri, long j);

    void cf();

    boolean cg();

    boolean ch();

    boolean ci();

    boolean cj();

    boolean cl();

    boolean cn();

    boolean co();

    boolean cp();

    boolean cq();

    boolean cr();

    boolean cs();

    boolean ct();

    boolean cu();

    boolean cv();

    boolean cw();

    boolean cy();

    boolean cz();

    int d();

    boolean da();

    boolean db();

    boolean dc();

    boolean dd();

    boolean de();

    boolean df();

    boolean dg();

    boolean di();

    boolean dj();

    boolean dl();

    byte[] dm();

    /* renamed from: do */
    String mo280do(int i);

    void dp();

    int f();

    int g();

    int h();

    int i();

    int j();

    int k();

    long l();

    long m();

    long n();

    long o();

    long p();

    long q();

    long r();

    long s();

    long t();

    Uri u();

    SelfIdentityId v();

    aubq w();

    axcm x();

    MessageCoreData y();

    MessageUsageStatisticsData z();
}
