import {useEffect, useState} from "react";

const UNKNOWN = "UNKNOWN"
const UNAVAILABLE = "UNAVAILABLE"

function App() {
  const [service1state, service1SetState] = useState(UNKNOWN);
  const [service2state, service2SetState] = useState(UNKNOWN);
  const [service3state, service3SetState] = useState(UNKNOWN);
  const [service4state, service4SetState] = useState(UNKNOWN);

// post argument s
  useEffect(() => {
    fetch('/api/service1/')
        .then((response) => {
            return response.text();
        })
        .then((data) => {
            service1SetState(data);
        }).catch(() => {
      service1SetState(UNAVAILABLE)
    });
  }, []);




  useEffect(() => {
    fetch('/api/service2/')
        .then((response) => {
            return response.text();
        })
        .then((data) => {
            service2SetState(data);
        }).catch(() => {
      service2SetState(UNAVAILABLE)
    });
  }, []);

    useEffect(() => {
        fetch('/api/service3/')
            .then((response) => {
                return response.text();
            })
            .then((data) => {
                service3SetState(data);
            }).catch(() => {
            service3SetState(UNAVAILABLE)
        });
    }, []);


    useEffect(() => {
        fetch('/api/service4/')
            .then((response) => {
                return response.text();
            })
            .then((data) => {
                service4SetState(data);
            }).catch(() => {
            service4SetState(UNAVAILABLE)
        });
    }, []);

  return (
    <div>
        service1 status: { service1state }<br/>
        service2 status: { service2state }<br/>
        service3 status: { service3state}<br/>
        service4 status: { service4state}
    </div>
  );
}

export default App;
