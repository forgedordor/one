package google.internal.communications.instantmessaging.v1;

import defpackage.evpz;
import defpackage.evqs;
import defpackage.evqz;
import defpackage.evrr;
import defpackage.evsg;
import defpackage.evsm;
import defpackage.evsn;
import defpackage.evtg;
import defpackage.evui;
import defpackage.evuo;
import defpackage.ezpd;
import defpackage.ezpe;
import defpackage.ezpf;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class TachyonCommon$PublicPreKeySets extends evsn<TachyonCommon$PublicPreKeySets, ezpf> implements evui {
    private static final TachyonCommon$PublicPreKeySets DEFAULT_INSTANCE;
    private static volatile evuo<TachyonCommon$PublicPreKeySets> PARSER = null;
    public static final int SETS_FIELD_NUMBER = 1;
    private evtg<ezpd> sets_ = emptyProtobufList();

    static {
        TachyonCommon$PublicPreKeySets tachyonCommon$PublicPreKeySets = new TachyonCommon$PublicPreKeySets();
        DEFAULT_INSTANCE = tachyonCommon$PublicPreKeySets;
        evsn.registerDefaultInstance(TachyonCommon$PublicPreKeySets.class, tachyonCommon$PublicPreKeySets);
    }

    private TachyonCommon$PublicPreKeySets() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSets(Iterable<? extends ezpd> iterable) {
        ensureSetsIsMutable();
        evpz.addAll(iterable, this.sets_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSets(int i, ezpd ezpdVar) {
        ezpdVar.getClass();
        ensureSetsIsMutable();
        this.sets_.add(i, ezpdVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSets() {
        this.sets_ = emptyProtobufList();
    }

    private void ensureSetsIsMutable() {
        evtg<ezpd> evtgVar = this.sets_;
        if (evtgVar.c()) {
            return;
        }
        this.sets_ = evsn.mutableCopy(evtgVar);
    }

    public static TachyonCommon$PublicPreKeySets getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ezpf newBuilder() {
        return (ezpf) DEFAULT_INSTANCE.createBuilder();
    }

    public static TachyonCommon$PublicPreKeySets parseDelimitedFrom(InputStream inputStream) {
        return (TachyonCommon$PublicPreKeySets) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TachyonCommon$PublicPreKeySets parseFrom(evqs evqsVar) {
        return (TachyonCommon$PublicPreKeySets) evsn.parseFrom(DEFAULT_INSTANCE, evqsVar);
    }

    public static evuo<TachyonCommon$PublicPreKeySets> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSets(int i) {
        ensureSetsIsMutable();
        this.sets_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSets(int i, ezpd ezpdVar) {
        ezpdVar.getClass();
        ensureSetsIsMutable();
        this.sets_.set(i, ezpdVar);
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"sets_", ezpd.class});
        }
        if (iOrdinal == 3) {
            return new TachyonCommon$PublicPreKeySets();
        }
        if (iOrdinal == 4) {
            return new ezpf();
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo<TachyonCommon$PublicPreKeySets> evuoVar = PARSER;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (TachyonCommon$PublicPreKeySets.class) {
            evsgVar = PARSER;
            if (evsgVar == null) {
                evsgVar = new evsg(DEFAULT_INSTANCE);
                PARSER = evsgVar;
            }
        }
        return evsgVar;
    }

    public ezpd getSets(int i) {
        return this.sets_.get(i);
    }

    public int getSetsCount() {
        return this.sets_.size();
    }

    public List<ezpd> getSetsList() {
        return this.sets_;
    }

    public ezpe getSetsOrBuilder(int i) {
        return this.sets_.get(i);
    }

    public List<? extends ezpe> getSetsOrBuilderList() {
        return this.sets_;
    }

    public static ezpf newBuilder(TachyonCommon$PublicPreKeySets tachyonCommon$PublicPreKeySets) {
        return (ezpf) DEFAULT_INSTANCE.createBuilder(tachyonCommon$PublicPreKeySets);
    }

    public static TachyonCommon$PublicPreKeySets parseDelimitedFrom(InputStream inputStream, evrr evrrVar) {
        return (TachyonCommon$PublicPreKeySets) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, evrrVar);
    }

    public static TachyonCommon$PublicPreKeySets parseFrom(evqs evqsVar, evrr evrrVar) {
        return (TachyonCommon$PublicPreKeySets) evsn.parseFrom(DEFAULT_INSTANCE, evqsVar, evrrVar);
    }

    public static TachyonCommon$PublicPreKeySets parseFrom(evqz evqzVar) {
        return (TachyonCommon$PublicPreKeySets) evsn.parseFrom(DEFAULT_INSTANCE, evqzVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSets(ezpd ezpdVar) {
        ezpdVar.getClass();
        ensureSetsIsMutable();
        this.sets_.add(ezpdVar);
    }

    public static TachyonCommon$PublicPreKeySets parseFrom(evqz evqzVar, evrr evrrVar) {
        return (TachyonCommon$PublicPreKeySets) evsn.parseFrom(DEFAULT_INSTANCE, evqzVar, evrrVar);
    }

    public static TachyonCommon$PublicPreKeySets parseFrom(InputStream inputStream) {
        return (TachyonCommon$PublicPreKeySets) evsn.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TachyonCommon$PublicPreKeySets parseFrom(InputStream inputStream, evrr evrrVar) {
        return (TachyonCommon$PublicPreKeySets) evsn.parseFrom(DEFAULT_INSTANCE, inputStream, evrrVar);
    }

    public static TachyonCommon$PublicPreKeySets parseFrom(ByteBuffer byteBuffer) {
        return (TachyonCommon$PublicPreKeySets) evsn.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static TachyonCommon$PublicPreKeySets parseFrom(ByteBuffer byteBuffer, evrr evrrVar) {
        return (TachyonCommon$PublicPreKeySets) evsn.parseFrom(DEFAULT_INSTANCE, byteBuffer, evrrVar);
    }

    public static TachyonCommon$PublicPreKeySets parseFrom(byte[] bArr) {
        return (TachyonCommon$PublicPreKeySets) evsn.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TachyonCommon$PublicPreKeySets parseFrom(byte[] bArr, evrr evrrVar) {
        return (TachyonCommon$PublicPreKeySets) evsn.parseFrom(DEFAULT_INSTANCE, bArr, evrrVar);
    }
}
