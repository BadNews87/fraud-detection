package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        url '/frauds'
        method GET()
    }
    response {
        status 200
        body(['tomek', 'jarek'])
    }
}
