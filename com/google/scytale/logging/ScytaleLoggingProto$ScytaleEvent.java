package com.google.scytale.logging;

import defpackage.evpz;
import defpackage.evqs;
import defpackage.evqz;
import defpackage.evrr;
import defpackage.evsg;
import defpackage.evsm;
import defpackage.evsn;
import defpackage.evui;
import defpackage.evuo;
import defpackage.exrk;
import defpackage.exrl;
import defpackage.exrm;
import defpackage.exrn;
import defpackage.exro;
import defpackage.exrp;
import defpackage.exrq;
import defpackage.exrr;
import defpackage.exrs;
import defpackage.exrt;
import defpackage.exru;
import defpackage.exrv;
import defpackage.exrw;
import defpackage.exrx;
import defpackage.exry;
import defpackage.exrz;
import defpackage.exsa;
import defpackage.exsb;
import defpackage.exsc;
import defpackage.exsd;
import defpackage.exse;
import defpackage.exsf;
import defpackage.exsg;
import defpackage.exsh;
import defpackage.exsi;
import defpackage.exsj;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ScytaleLoggingProto$ScytaleEvent extends evsn<ScytaleLoggingProto$ScytaleEvent, exsg> implements evui {
    public static final int API_RESULT_FIELD_NUMBER = 2;
    public static final int DATABASE_OPEN_ERROR_FIELD_NUMBER = 3;
    public static final int DECRYPTION_SUCCESSFUL_FIELD_NUMBER = 7;
    private static final ScytaleLoggingProto$ScytaleEvent DEFAULT_INSTANCE;
    public static final int ENCRYPTION_SUCCESSFUL_FIELD_NUMBER = 9;
    public static final int FAILED_TO_DECRYPT_FIELD_NUMBER = 6;
    public static final int FAILED_TO_ENCRYPT_FIELD_NUMBER = 8;
    public static final int FTD_SHOULD_NOT_BE_SENT_FIELD_NUMBER = 11;
    public static final int KEY_TRANSPARENCY_EVENT_FIELD_NUMBER = 12;
    private static volatile evuo<ScytaleLoggingProto$ScytaleEvent> PARSER = null;
    public static final int PREKEY_FETCH_COMPLETE_FIELD_NUMBER = 10;
    public static final int SCHEMA_MIGRATION_END_FIELD_NUMBER = 5;
    public static final int SCHEMA_MIGRATION_START_FIELD_NUMBER = 4;
    public static final int SET_DEVICE_ID_EVENT_FIELD_NUMBER = 13;
    public static final int TRACE_ID_FIELD_NUMBER = 1;
    private Object event_;
    private int eventCase_ = 0;
    private String traceId_ = "";

    static {
        ScytaleLoggingProto$ScytaleEvent scytaleLoggingProto$ScytaleEvent = new ScytaleLoggingProto$ScytaleEvent();
        DEFAULT_INSTANCE = scytaleLoggingProto$ScytaleEvent;
        evsn.registerDefaultInstance(ScytaleLoggingProto$ScytaleEvent.class, scytaleLoggingProto$ScytaleEvent);
    }

    private ScytaleLoggingProto$ScytaleEvent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApiResult() {
        if (this.eventCase_ == 2) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDatabaseOpenError() {
        if (this.eventCase_ == 3) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDecryptionSuccessful() {
        if (this.eventCase_ == 7) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEncryptionSuccessful() {
        if (this.eventCase_ == 9) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvent() {
        this.eventCase_ = 0;
        this.event_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFailedToDecrypt() {
        if (this.eventCase_ == 6) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFailedToEncrypt() {
        if (this.eventCase_ == 8) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFtdShouldNotBeSent() {
        if (this.eventCase_ == 11) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyTransparencyEvent() {
        if (this.eventCase_ == 12) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrekeyFetchComplete() {
        if (this.eventCase_ == 10) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSchemaMigrationEnd() {
        if (this.eventCase_ == 5) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSchemaMigrationStart() {
        if (this.eventCase_ == 4) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSetDeviceIdEvent() {
        if (this.eventCase_ == 13) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTraceId() {
        this.traceId_ = getDefaultInstance().getTraceId();
    }

    public static ScytaleLoggingProto$ScytaleEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeApiResult(exrl exrlVar) {
        exrlVar.getClass();
        evpz evpzVarBuildPartial = exrlVar;
        if (this.eventCase_ == 2) {
            Object obj = this.event_;
            exrl exrlVar2 = exrl.a;
            evpzVarBuildPartial = exrlVar;
            if (obj != exrlVar2) {
                exrk exrkVar = (exrk) exrlVar2.createBuilder((exrl) this.event_);
                exrkVar.mergeFrom((exrk) exrlVar);
                evpzVarBuildPartial = exrkVar.buildPartial();
            }
        }
        this.event_ = evpzVarBuildPartial;
        this.eventCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDatabaseOpenError(exrn exrnVar) {
        exrnVar.getClass();
        evpz evpzVarBuildPartial = exrnVar;
        if (this.eventCase_ == 3) {
            Object obj = this.event_;
            exrn exrnVar2 = exrn.a;
            evpzVarBuildPartial = exrnVar;
            if (obj != exrnVar2) {
                exrm exrmVar = (exrm) exrnVar2.createBuilder((exrn) this.event_);
                exrmVar.mergeFrom((exrm) exrnVar);
                evpzVarBuildPartial = exrmVar.buildPartial();
            }
        }
        this.event_ = evpzVarBuildPartial;
        this.eventCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDecryptionSuccessful(exrp exrpVar) {
        exrpVar.getClass();
        evpz evpzVarBuildPartial = exrpVar;
        if (this.eventCase_ == 7) {
            Object obj = this.event_;
            exrp exrpVar2 = exrp.a;
            evpzVarBuildPartial = exrpVar;
            if (obj != exrpVar2) {
                exro exroVar = (exro) exrpVar2.createBuilder((exrp) this.event_);
                exroVar.mergeFrom((exro) exrpVar);
                evpzVarBuildPartial = exroVar.buildPartial();
            }
        }
        this.event_ = evpzVarBuildPartial;
        this.eventCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEncryptionSuccessful(exrr exrrVar) {
        exrrVar.getClass();
        evpz evpzVarBuildPartial = exrrVar;
        if (this.eventCase_ == 9) {
            Object obj = this.event_;
            exrr exrrVar2 = exrr.a;
            evpzVarBuildPartial = exrrVar;
            if (obj != exrrVar2) {
                exrq exrqVar = (exrq) exrrVar2.createBuilder((exrr) this.event_);
                exrqVar.mergeFrom((exrq) exrrVar);
                evpzVarBuildPartial = exrqVar.buildPartial();
            }
        }
        this.event_ = evpzVarBuildPartial;
        this.eventCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFailedToDecrypt(exrt exrtVar) {
        exrtVar.getClass();
        evpz evpzVarBuildPartial = exrtVar;
        if (this.eventCase_ == 6) {
            Object obj = this.event_;
            exrt exrtVar2 = exrt.a;
            evpzVarBuildPartial = exrtVar;
            if (obj != exrtVar2) {
                exrs exrsVar = (exrs) exrtVar2.createBuilder((exrt) this.event_);
                exrsVar.mergeFrom((exrs) exrtVar);
                evpzVarBuildPartial = exrsVar.buildPartial();
            }
        }
        this.event_ = evpzVarBuildPartial;
        this.eventCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFailedToEncrypt(exrv exrvVar) {
        exrvVar.getClass();
        evpz evpzVarBuildPartial = exrvVar;
        if (this.eventCase_ == 8) {
            Object obj = this.event_;
            exrv exrvVar2 = exrv.a;
            evpzVarBuildPartial = exrvVar;
            if (obj != exrvVar2) {
                exru exruVar = (exru) exrvVar2.createBuilder((exrv) this.event_);
                exruVar.mergeFrom((exru) exrvVar);
                evpzVarBuildPartial = exruVar.buildPartial();
            }
        }
        this.event_ = evpzVarBuildPartial;
        this.eventCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFtdShouldNotBeSent(exrx exrxVar) {
        exrxVar.getClass();
        evpz evpzVarBuildPartial = exrxVar;
        if (this.eventCase_ == 11) {
            Object obj = this.event_;
            exrx exrxVar2 = exrx.a;
            evpzVarBuildPartial = exrxVar;
            if (obj != exrxVar2) {
                exrw exrwVar = (exrw) exrxVar2.createBuilder((exrx) this.event_);
                exrwVar.mergeFrom((exrw) exrxVar);
                evpzVarBuildPartial = exrwVar.buildPartial();
            }
        }
        this.event_ = evpzVarBuildPartial;
        this.eventCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeKeyTransparencyEvent(exrz exrzVar) {
        exrzVar.getClass();
        evpz evpzVarBuildPartial = exrzVar;
        if (this.eventCase_ == 12) {
            Object obj = this.event_;
            exrz exrzVar2 = exrz.a;
            evpzVarBuildPartial = exrzVar;
            if (obj != exrzVar2) {
                exry exryVar = (exry) exrzVar2.createBuilder((exrz) this.event_);
                exryVar.mergeFrom((exry) exrzVar);
                evpzVarBuildPartial = exryVar.buildPartial();
            }
        }
        this.event_ = evpzVarBuildPartial;
        this.eventCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePrekeyFetchComplete(exsb exsbVar) {
        exsbVar.getClass();
        evpz evpzVarBuildPartial = exsbVar;
        if (this.eventCase_ == 10) {
            Object obj = this.event_;
            exsb exsbVar2 = exsb.a;
            evpzVarBuildPartial = exsbVar;
            if (obj != exsbVar2) {
                exsa exsaVar = (exsa) exsbVar2.createBuilder((exsb) this.event_);
                exsaVar.mergeFrom((exsa) exsbVar);
                evpzVarBuildPartial = exsaVar.buildPartial();
            }
        }
        this.event_ = evpzVarBuildPartial;
        this.eventCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSchemaMigrationEnd(exsd exsdVar) {
        exsdVar.getClass();
        evpz evpzVarBuildPartial = exsdVar;
        if (this.eventCase_ == 5) {
            Object obj = this.event_;
            exsd exsdVar2 = exsd.a;
            evpzVarBuildPartial = exsdVar;
            if (obj != exsdVar2) {
                exsc exscVar = (exsc) exsdVar2.createBuilder((exsd) this.event_);
                exscVar.mergeFrom((exsc) exsdVar);
                evpzVarBuildPartial = exscVar.buildPartial();
            }
        }
        this.event_ = evpzVarBuildPartial;
        this.eventCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSchemaMigrationStart(exsf exsfVar) {
        exsfVar.getClass();
        evpz evpzVarBuildPartial = exsfVar;
        if (this.eventCase_ == 4) {
            Object obj = this.event_;
            exsf exsfVar2 = exsf.a;
            evpzVarBuildPartial = exsfVar;
            if (obj != exsfVar2) {
                exse exseVar = (exse) exsfVar2.createBuilder((exsf) this.event_);
                exseVar.mergeFrom((exse) exsfVar);
                evpzVarBuildPartial = exseVar.buildPartial();
            }
        }
        this.event_ = evpzVarBuildPartial;
        this.eventCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSetDeviceIdEvent(exsj exsjVar) {
        exsjVar.getClass();
        evpz evpzVarBuildPartial = exsjVar;
        if (this.eventCase_ == 13) {
            Object obj = this.event_;
            exsj exsjVar2 = exsj.a;
            evpzVarBuildPartial = exsjVar;
            if (obj != exsjVar2) {
                exsi exsiVar = (exsi) exsjVar2.createBuilder((exsj) this.event_);
                exsiVar.mergeFrom((exsi) exsjVar);
                evpzVarBuildPartial = exsiVar.buildPartial();
            }
        }
        this.event_ = evpzVarBuildPartial;
        this.eventCase_ = 13;
    }

    public static exsg newBuilder() {
        return (exsg) DEFAULT_INSTANCE.createBuilder();
    }

    public static ScytaleLoggingProto$ScytaleEvent parseDelimitedFrom(InputStream inputStream) {
        return (ScytaleLoggingProto$ScytaleEvent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ScytaleLoggingProto$ScytaleEvent parseFrom(evqs evqsVar) {
        return (ScytaleLoggingProto$ScytaleEvent) evsn.parseFrom(DEFAULT_INSTANCE, evqsVar);
    }

    public static evuo<ScytaleLoggingProto$ScytaleEvent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApiResult(exrl exrlVar) {
        exrlVar.getClass();
        this.event_ = exrlVar;
        this.eventCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDatabaseOpenError(exrn exrnVar) {
        exrnVar.getClass();
        this.event_ = exrnVar;
        this.eventCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDecryptionSuccessful(exrp exrpVar) {
        exrpVar.getClass();
        this.event_ = exrpVar;
        this.eventCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncryptionSuccessful(exrr exrrVar) {
        exrrVar.getClass();
        this.event_ = exrrVar;
        this.eventCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailedToDecrypt(exrt exrtVar) {
        exrtVar.getClass();
        this.event_ = exrtVar;
        this.eventCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailedToEncrypt(exrv exrvVar) {
        exrvVar.getClass();
        this.event_ = exrvVar;
        this.eventCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFtdShouldNotBeSent(exrx exrxVar) {
        exrxVar.getClass();
        this.event_ = exrxVar;
        this.eventCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyTransparencyEvent(exrz exrzVar) {
        exrzVar.getClass();
        this.event_ = exrzVar;
        this.eventCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrekeyFetchComplete(exsb exsbVar) {
        exsbVar.getClass();
        this.event_ = exsbVar;
        this.eventCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSchemaMigrationEnd(exsd exsdVar) {
        exsdVar.getClass();
        this.event_ = exsdVar;
        this.eventCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSchemaMigrationStart(exsf exsfVar) {
        exsfVar.getClass();
        this.event_ = exsfVar;
        this.eventCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSetDeviceIdEvent(exsj exsjVar) {
        exsjVar.getClass();
        this.event_ = exsjVar;
        this.eventCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTraceId(String str) {
        str.getClass();
        this.traceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTraceIdBytes(evqs evqsVar) {
        checkByteStringIsUtf8(evqsVar);
        this.traceId_ = evqsVar.E();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\r\u0001\u0000\u0001\r\r\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000", new Object[]{"event_", "eventCase_", "traceId_", exrl.class, exrn.class, exsf.class, exsd.class, exrt.class, exrp.class, exrv.class, exrr.class, exsb.class, exrx.class, exrz.class, exsj.class});
        }
        if (iOrdinal == 3) {
            return new ScytaleLoggingProto$ScytaleEvent();
        }
        if (iOrdinal == 4) {
            return new exsg();
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo<ScytaleLoggingProto$ScytaleEvent> evuoVar = PARSER;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ScytaleLoggingProto$ScytaleEvent.class) {
            evsgVar = PARSER;
            if (evsgVar == null) {
                evsgVar = new evsg(DEFAULT_INSTANCE);
                PARSER = evsgVar;
            }
        }
        return evsgVar;
    }

    public exrl getApiResult() {
        return this.eventCase_ == 2 ? (exrl) this.event_ : exrl.a;
    }

    public exrn getDatabaseOpenError() {
        return this.eventCase_ == 3 ? (exrn) this.event_ : exrn.a;
    }

    public exrp getDecryptionSuccessful() {
        return this.eventCase_ == 7 ? (exrp) this.event_ : exrp.a;
    }

    public exrr getEncryptionSuccessful() {
        return this.eventCase_ == 9 ? (exrr) this.event_ : exrr.a;
    }

    public exsh getEventCase() {
        int i = this.eventCase_;
        if (i == 0) {
            return exsh.EVENT_NOT_SET;
        }
        switch (i) {
            case 2:
                return exsh.API_RESULT;
            case 3:
                return exsh.DATABASE_OPEN_ERROR;
            case 4:
                return exsh.SCHEMA_MIGRATION_START;
            case 5:
                return exsh.SCHEMA_MIGRATION_END;
            case 6:
                return exsh.FAILED_TO_DECRYPT;
            case 7:
                return exsh.DECRYPTION_SUCCESSFUL;
            case 8:
                return exsh.FAILED_TO_ENCRYPT;
            case 9:
                return exsh.ENCRYPTION_SUCCESSFUL;
            case 10:
                return exsh.PREKEY_FETCH_COMPLETE;
            case 11:
                return exsh.FTD_SHOULD_NOT_BE_SENT;
            case 12:
                return exsh.KEY_TRANSPARENCY_EVENT;
            case 13:
                return exsh.SET_DEVICE_ID_EVENT;
            default:
                return null;
        }
    }

    public exrt getFailedToDecrypt() {
        return this.eventCase_ == 6 ? (exrt) this.event_ : exrt.a;
    }

    public exrv getFailedToEncrypt() {
        return this.eventCase_ == 8 ? (exrv) this.event_ : exrv.a;
    }

    public exrx getFtdShouldNotBeSent() {
        return this.eventCase_ == 11 ? (exrx) this.event_ : exrx.a;
    }

    public exrz getKeyTransparencyEvent() {
        return this.eventCase_ == 12 ? (exrz) this.event_ : exrz.a;
    }

    public exsb getPrekeyFetchComplete() {
        return this.eventCase_ == 10 ? (exsb) this.event_ : exsb.a;
    }

    public exsd getSchemaMigrationEnd() {
        return this.eventCase_ == 5 ? (exsd) this.event_ : exsd.a;
    }

    public exsf getSchemaMigrationStart() {
        return this.eventCase_ == 4 ? (exsf) this.event_ : exsf.a;
    }

    public exsj getSetDeviceIdEvent() {
        return this.eventCase_ == 13 ? (exsj) this.event_ : exsj.a;
    }

    public String getTraceId() {
        return this.traceId_;
    }

    public evqs getTraceIdBytes() {
        return evqs.A(this.traceId_);
    }

    public boolean hasApiResult() {
        return this.eventCase_ == 2;
    }

    public boolean hasDatabaseOpenError() {
        return this.eventCase_ == 3;
    }

    public boolean hasDecryptionSuccessful() {
        return this.eventCase_ == 7;
    }

    public boolean hasEncryptionSuccessful() {
        return this.eventCase_ == 9;
    }

    public boolean hasFailedToDecrypt() {
        return this.eventCase_ == 6;
    }

    public boolean hasFailedToEncrypt() {
        return this.eventCase_ == 8;
    }

    public boolean hasFtdShouldNotBeSent() {
        return this.eventCase_ == 11;
    }

    public boolean hasKeyTransparencyEvent() {
        return this.eventCase_ == 12;
    }

    public boolean hasPrekeyFetchComplete() {
        return this.eventCase_ == 10;
    }

    public boolean hasSchemaMigrationEnd() {
        return this.eventCase_ == 5;
    }

    public boolean hasSchemaMigrationStart() {
        return this.eventCase_ == 4;
    }

    public boolean hasSetDeviceIdEvent() {
        return this.eventCase_ == 13;
    }

    public static exsg newBuilder(ScytaleLoggingProto$ScytaleEvent scytaleLoggingProto$ScytaleEvent) {
        return (exsg) DEFAULT_INSTANCE.createBuilder(scytaleLoggingProto$ScytaleEvent);
    }

    public static ScytaleLoggingProto$ScytaleEvent parseDelimitedFrom(InputStream inputStream, evrr evrrVar) {
        return (ScytaleLoggingProto$ScytaleEvent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, evrrVar);
    }

    public static ScytaleLoggingProto$ScytaleEvent parseFrom(evqs evqsVar, evrr evrrVar) {
        return (ScytaleLoggingProto$ScytaleEvent) evsn.parseFrom(DEFAULT_INSTANCE, evqsVar, evrrVar);
    }

    public static ScytaleLoggingProto$ScytaleEvent parseFrom(evqz evqzVar) {
        return (ScytaleLoggingProto$ScytaleEvent) evsn.parseFrom(DEFAULT_INSTANCE, evqzVar);
    }

    public static ScytaleLoggingProto$ScytaleEvent parseFrom(evqz evqzVar, evrr evrrVar) {
        return (ScytaleLoggingProto$ScytaleEvent) evsn.parseFrom(DEFAULT_INSTANCE, evqzVar, evrrVar);
    }

    public static ScytaleLoggingProto$ScytaleEvent parseFrom(InputStream inputStream) {
        return (ScytaleLoggingProto$ScytaleEvent) evsn.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ScytaleLoggingProto$ScytaleEvent parseFrom(InputStream inputStream, evrr evrrVar) {
        return (ScytaleLoggingProto$ScytaleEvent) evsn.parseFrom(DEFAULT_INSTANCE, inputStream, evrrVar);
    }

    public static ScytaleLoggingProto$ScytaleEvent parseFrom(ByteBuffer byteBuffer) {
        return (ScytaleLoggingProto$ScytaleEvent) evsn.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ScytaleLoggingProto$ScytaleEvent parseFrom(ByteBuffer byteBuffer, evrr evrrVar) {
        return (ScytaleLoggingProto$ScytaleEvent) evsn.parseFrom(DEFAULT_INSTANCE, byteBuffer, evrrVar);
    }

    public static ScytaleLoggingProto$ScytaleEvent parseFrom(byte[] bArr) {
        return (ScytaleLoggingProto$ScytaleEvent) evsn.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ScytaleLoggingProto$ScytaleEvent parseFrom(byte[] bArr, evrr evrrVar) {
        return (ScytaleLoggingProto$ScytaleEvent) evsn.parseFrom(DEFAULT_INSTANCE, bArr, evrrVar);
    }
}
